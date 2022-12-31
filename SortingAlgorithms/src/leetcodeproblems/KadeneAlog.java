package leetcodeproblems;

public class KadeneAlog {

    static int findMaximumSubArray(int[] arr){
        int length = arr.length;
        if(length == 0){
            return -1;
        }else if(length == 1){
            return arr[1];
        }else{
            int sum = 0, max = arr[0];
            for(int i = 0; i < length; i++){
                sum+=arr[i];
                max = Math.max(max, sum);
                sum = sum < 0 ? 0 : sum;
            }
            return max;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-4, -1, 12, 6, -1, 6};
        System.out.println(findMaximumSubArray(arr));
    }
}
