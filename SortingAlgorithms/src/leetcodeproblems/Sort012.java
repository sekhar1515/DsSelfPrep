package leetcodeproblems;

import java.util.Arrays;

public class Sort012 {

    static void sortArrayElements(int[] arr){
        int low = 0, mid = 0, high = arr.length - 1;
        while(mid <= high){
            if(arr[mid] == 0){
                swapArr(arr,mid, low);
                mid++;
                low++;
            }else if(arr[mid]  == 1){
                mid++;
            }else{
                swapArr(arr, mid, high);
                high--;
            }
        }
    }

    static  private void swapArr(int[] arr, int mid, int low) {

        int temp = arr[mid];
        arr[mid]  = arr[low];
        arr[low] = temp;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,1,1,2,0,0,2,1,0,1,0,0};
        sortArrayElements(arr);
        Arrays.stream(arr).forEach((ele) -> {System.out.print(ele + " ");});
    }
}
