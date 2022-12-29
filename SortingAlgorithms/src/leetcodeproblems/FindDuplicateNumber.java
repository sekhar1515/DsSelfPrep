package leetcodeproblems;


//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//        There is only one repeated number in nums, return this repeated number.
//
//        You must solve the problem without modifying the array nums and uses only constant extra space.
//Input: nums = [1,3,4,2,2]
//        Output: 2
public class FindDuplicateNumber {
    public int findDuplicate(int[] nums){
//        Approach using extra space
        // int[] sortedArray = new int[nums.length];
        // for(int i: nums){
        //     if(sortedArray[i] == 1){
        //         return i;
        //     }
        //     sortedArray[i] = 1;
        // }
        // return 0;
        int slowPtr = nums[0], fastPtr = nums[0];
        do{
            slowPtr = nums[slowPtr];
            fastPtr = nums[fastPtr];
        }while(slowPtr != fastPtr);

        fastPtr = nums[0];

        while(slowPtr != fastPtr){
            slowPtr = nums[slowPtr];
            fastPtr = nums[fastPtr];
        }
        return slowPtr;
    }
    public static void main(String[] args) {
        FindDuplicateNumber findDuplicateNumber = new FindDuplicateNumber();
        int result = findDuplicateNumber.findDuplicate(new int[]{1,3,4,2,2});
        System.out.print((result));
    }
}
