package 力扣刷题;

import java.util.Arrays;

public class square {

    public static void main(String[] args) {
        int [] arr = {-3,-1,0,2,5};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    public static int[] sortedSquares(int[] nums) {
        for (int i =0;i<nums.length;i++){
            nums[i]=(int)Math.pow(nums[i],2);
        }
        Arrays.sort(nums);
        return nums;
    }

}
