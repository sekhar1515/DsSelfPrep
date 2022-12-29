package sortingalgor;

import java.util.Arrays;

public class InsertionSort {
    static void sortArray(int[] arr){
        int i;
        for(i = 1; i < arr.length ; i++){
            int j = i-1;
            int key = arr[i];
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j-=1;
            }
            arr[j+1] = key;
        }
        Arrays.stream(arr).forEach((ele) -> {System.out.println(ele);});
    }
    public static void main(String[] args) {
    sortArray(new int[] {1289,8734,8942,0});
    }
}
