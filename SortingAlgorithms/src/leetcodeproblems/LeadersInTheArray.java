package leetcodeproblems;

import java.util.ArrayList;

public class LeadersInTheArray {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Inialize the values to store the max and array list to store the result
        ArrayList<Integer> result = new ArrayList<>();
        int max = -1;
        //Iterate from the last of the array to find the leaders
        for (int i = n - 1; i >= 0; --i) {
            // If the current element is greater than max then we update the max and add the leader
            if (arr[i] >= max) {
                max = arr[i];
                result.add(0, max);
            }
        }
        //Finally return the result.
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = leaders(arr.length, arr);
        // Leaders in the array
        result.forEach(element -> System.out.print(element + " "));
    }
}
