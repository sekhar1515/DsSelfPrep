package leetcodeproblems;

import java.util.Arrays;

public class MissingAndRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,3};
        findMissingAndRepeatingNumber(arr);
    }

    private static void findMissingAndRepeatingNumber(int[] arr) {
        final int[] xorElement = {0};
        Arrays.stream(arr).forEach((ele) -> {
            xorElement[0]^= ele ;});

        for(int i = 1; i <= arr.length; i++){
            xorElement[0] ^= i;
        }

        int setBit = xorElement[0]^(xorElement[0] -1);
        final int[] x = {0};
        final int[] y = {0};

        Arrays.stream(arr).forEach((ele) -> {
            if((ele & setBit) != 0){
                x[0] ^=ele;
            }else{
                y[0] ^=ele;
            }
        });

        for(int i = 0; i <= arr.length; i++){
            if((i & setBit) != 0){
                x[0] ^=i;
            }else{
                y[0] ^=i;
            }
        }
        System.out.println("Repeating Number : " + x[0] + " Missing Number : " + y[0]);

    }
}
