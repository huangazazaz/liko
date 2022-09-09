package 力扣刷题;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums) {
        int right = nums.length - 1, left;
        while (right >= 0) {
            while (nums[right] == 0) {
                right--;
                if (right<0) return;
            }
            left = right;
            while (nums[left] != 0) {
                left--;
                if (left < 0) return;
            }
            for (int i = left; i < right; i++) {
                nums[i] = nums[i + 1];
            }
            nums[right] = 0;

        }
    }

}
