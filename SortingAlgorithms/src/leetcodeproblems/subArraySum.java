package leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

public class subArraySum {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        int countOfSubArrays = subarraySum(nums, k);
        System.out.println("No of subarrays with sum " + k + " is " + countOfSubArrays);
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int prefixSum = 0, count = 0;
        hashMap.put(0, 1);
        for (int i : nums) {
            prefixSum += i;
            if (hashMap.containsKey(prefixSum - k)) {
                count += hashMap.get(prefixSum - k);
            }
            hashMap.put(prefixSum, hashMap.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}
