package leetcodeproblems;

import java.util.Arrays;

public class NextHigherPermutation {
    private static void findNextHigherPermutation(int[] nums) {
        int i = nums.length - 2;
        // finding the pivot where the element is less than next element
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        //If the element is not found then the array is in decreasing order we need to reverse the array
        if (i >= 0) {
            //iterate from the end and find the element that is just greater than ith element
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            //swap the ith element with jth element to get the next largest element
            swap(nums, i, j);
        }
        //Finally we reverse the array from i+1 location so that since the array is sorted in decreasing order will be reversed
        reverse(nums, i + 1, nums.length - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int index1, int index2) {
        while (index1 <= index2) {
            swap(nums, index1, index2);
            index1++;
            index2--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        findNextHigherPermutation(nums);
        System.out.println("Next highest permutation : " + Arrays.toString(nums));
    }
}
