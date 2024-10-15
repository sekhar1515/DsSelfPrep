package leetcodeproblems;

import java.util.Arrays;
//problem link: https://leetcode.com/problems/longest-consecutive-sequence/description/
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        System.out.println("Length of longest consecutive sequence : " + longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int count = 1, maxCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                count++;
            } else if (nums[i] - nums[i - 1] != 0) {
                maxCount = Math.max(count, maxCount);
                count = 1;
            }
            maxCount = Math.max(count, maxCount);

        }
        return maxCount;
    }
}
