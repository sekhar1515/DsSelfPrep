package leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

//Problem link : https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = findIndicesForSum(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] findIndicesForSum(int[] nums, int target) {
        // Initialize a HashMap to store the remaining value needed to reach the target
        Map<Integer, Integer> hashMap = new HashMap<>();

        // Iterate through the array elements
        for (int i = 0; i < nums.length; i++) {
            // Calculate the remaining value to reach the target sum
            int remaining = target - nums[i];

            // Check if the current element is already present in the HashMap
            // This means we have found the two numbers that add up to the target
            if (hashMap.containsKey(nums[i])) {
                // Return the current index and the index stored in the HashMap
                return new int[]{i, hashMap.get(nums[i])};
            }

            // If the remaining value is not in the HashMap, store it with the current index
            if (!hashMap.containsKey(remaining)) {
                hashMap.put(remaining, i);
            }
        }

        // Return a default value (this line may never be reached in valid cases)
        return new int[]{0, 0};
    }

}
