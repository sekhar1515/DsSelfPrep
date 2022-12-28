package sortingalgor;

import java.util.Arrays;

public class SelectionSort{
    public void selectionSort(int[] arr){
//         Everytime pick min element and swap it with the first index.
        int i = 0, j = 0;

        for(i = 0; i < arr.length; i++){
            int min = arr[i];
            int index2 = i;
            for( j = i +1; j < arr.length; j++){
                if(min > arr[j]){
                    min = arr[j];
                    index2 = j;
                }
            }
            swap(arr, i, index2);
        }
        Arrays.stream(arr).forEach((ele) -> System.out.println(ele));

    }

    private void swap(int[] arr, int index, int index2){
        int temp = arr[index];
        arr[index] = arr[index2];
        arr[index2] = temp;
    }


}
