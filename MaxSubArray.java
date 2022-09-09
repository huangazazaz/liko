package 力扣刷题;

public class MaxSubArray {

    public static void main(String[] args) {
        int [] a = {5,4,-1,7,8};
        int b = maxSubArray(a);
        System.out.println(b);
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0], fx = 0;
        for (int i = 0; i < nums.length; i++) {
            fx = Math.max(nums[i]+fx,nums[i] );
            max = Math.max(max,fx);
        }
        return max;

    }
}
