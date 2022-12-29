package sortingalgor;

import java.util.Arrays;

public class QuickSort {

    static void sort(int[] arr, int low, int high){
        if(low < high){
            int pivot = partition(arr, low, high);
            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }

    static private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int pIndex = low;
        for(int i = low ; i < high; i++){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }
        int temp = arr[pIndex];
        arr[pIndex] = arr[high];
        arr[high] = temp;
        return pIndex;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,33,2,9,14,16};
        sort(arr, 0, arr.length  - 1);
        Arrays.stream(arr).forEach(ele -> {System.out.print(ele +" ");});
    }
}
