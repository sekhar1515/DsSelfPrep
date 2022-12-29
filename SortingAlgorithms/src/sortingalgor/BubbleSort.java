package sortingalgor;

import java.util.Arrays;

public class BubbleSort
{
//    The bubble sort works in such a way that we always swap consecutive elements and then we move forward.
//     TC : O(N^2)
    public void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            boolean isSwapped = false;
            for(int j = 0; j < arr.length - i -1; j++){
                if(arr[j] > arr[j+1]){
                    swapValues(arr,j+1,j);
                    isSwapped = true;
                }
            }
            if(!isSwapped)
                break;
        }
        Arrays.stream(arr).forEach((ele) -> {System.out.println(ele);});
    }

    private void swapValues(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
