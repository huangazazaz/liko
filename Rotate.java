package 力扣刷题;

import java.util.Arrays;

public class Rotate {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        rotate(a, 3);
        System.out.println(Arrays.toString(a));
    }

    public static void rotate(int[] nums, int k) {

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int l = i + k;
            while (l > nums.length) {
                l -= nums.length;
            }
                result[l] = nums[i];
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
    }

}
