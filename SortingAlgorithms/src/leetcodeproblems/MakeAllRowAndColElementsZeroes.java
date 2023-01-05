package leetcodeproblems;

import java.util.Arrays;

public class MakeAllRowAndColElementsZeroes {

    static void makeAllCorrespondingElementsZeroes(int[][] arr){
        int rows = arr.length, cols = arr[0].length;
        int[] rowArr = new int[rows];
        int[] colArr = new int[cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols ; j++){
                if(arr[i][j] == 0){
                    rowArr[i] = 1;
                    colArr[j] = 1;
                }
            }
        }
        for(int i = 0; i < rows; i++){
            if(rowArr[i] == 1){
                for(int j = 0; j < cols; j++){
                    arr[i][j] = 0;
                }
            }
        }
        for(int i = 0; i < cols; i++){
            if(colArr[i] == 1){
                for(int j = 0;  j < cols; j++){
                    arr[j][i] = 0;
                }
            }
        }
        Arrays.stream(arr).forEach((ele) -> {
            Arrays.stream(ele).forEach(ele2 -> {
                System.out.println(ele2);
            });
        });
    }

    public static void main(String[] args) {
        int[][] arr = {{1,0,1}, {1,1,0}, {0,1,1}};
        makeAllCorrespondingElementsZeroes(arr);
    }
}
