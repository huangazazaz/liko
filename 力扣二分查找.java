package 力扣刷题;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 力扣二分查找 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return false;
        }
        return true;
    }



}
