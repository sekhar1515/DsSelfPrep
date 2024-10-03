package leetcodeproblems;

//problem link : https://leetcode.com/problems/majority-element/description/
public class MajorityElement {
    public static void main(String[] args) {
        // Define an array with a majority element
        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        // Call the getMajorityElement method and print the result
        System.out.println("Majority Element is " + getMajorityElement(arr));
    }

    // This method implements the Boyer-Moore Voting Algorithm to find the majority element
    private static int getMajorityElement(int[] arr) {
        int majorityElement = 0; // This will store the candidate for majority element
        int count = 0; // This will store the count of occurrences of the candidate

        // Iterate through each element in the array
        for (int i : arr) {
            // If count is zero, assign the current element as the majority candidate
            if (count == 0) {
                majorityElement = i;
                count++;
            }
            // If the current element is not equal to the majority candidate, decrease count
            else if (majorityElement != i) {
                count--;
            }
            // If the current element is equal to the majority candidate, increase count
            else {
                count++;
            }
        }

        // Return the element that is the majority in the array
        return majorityElement;
    }
}
