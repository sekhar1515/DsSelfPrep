package leetcodeproblems;

import java.util.Arrays;

public class NextPermutation {

    public static void findNextPermutation(int[] arr){
        int index1 = 0, index2 = 0, length = arr.length - 1;
        for(int i = length - 1 ; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                index1 = i;
                break;
            }
        }
        for(int i = length; i >= 0; i--){
            if(arr[i] > arr[index1]){
                index2 = i;
                break;
            }
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] =temp;
        int low = index1 + 1;
        int high = length;
        while(low <= high){
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        Arrays.stream(arr).forEach((ele) -> {System.out.println(ele) ;});

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,4,2};
        findNextPermutation(arr);
    }
}
