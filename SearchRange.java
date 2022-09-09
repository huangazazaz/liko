package 力扣刷题;

import java.util.Arrays;

public class SearchRange {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int[] a= searchRange(nums,8);
        System.out.println(Arrays.toString(a));
    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        if (nums.length == 1) {
            if (nums[0] == target) {
                return new int[]{0, 0};
            } else {
                return new int[]{-1, -1};
            }
        }
        int[] num = {-1,-1};
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target && mid == nums.length-1){
                num[1] = mid;
                break;
            }
            if (nums[mid] > target && mid - 1 >= 0 && nums[mid - 1] == target) {
                num[1] = mid - 1;
                break;
            } else if (nums[mid] > target && mid - 1 >= 0 && nums[mid - 1] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target && mid == 0){
                num[0] = mid;
                break;
            }
            if (nums[mid] == target && mid - 1 >= 0 && nums[mid - 1] < target) {
                num[0] = mid;
                break;
            } else if (nums[mid] < target && mid + 1 < nums.length && nums[mid + 1] <= target) {
                left = mid + 1;
            } else {
                right = mid-1;
            }
        }
        return num;
    }

}
