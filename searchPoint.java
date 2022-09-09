//package 力扣刷题;
//
//import java.util.Arrays;
//
//public class searchPoint {
//    public int search(int[] nums, int target) {
//        int first = 0, last = nums.length - 1;
//        if (first == last) {
//            if (nums[first] == target) {
//                return first;
//            } else {
//                return -1;
//            }
//        }
//        if (nums[(first + last) / 2] > target) {
//            last = (first + last) / 2;
//            nums = Arrays.copyOfRange(nums, first, last);
//            int result = new 力扣二分查找().search(nums, target);
//        } else if (nums[(first + last) / 2] < target) {
//            first = (first + last) / 2;
//            nums = Arrays.copyOfRange(nums, first, last);
//            int result = new 力扣二分查找().search(nums, target);
//        } else {
//            return (first + last) / 2;
//        }
//        return -1;
//    }
//}
