package 力扣刷题;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0,l = 0;
        int [] arrayList = new int[Math.max(nums1.length,nums2.length)];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                arrayList[l] = nums2[j];
                l++;
                i++;
                j++;
                continue;
            }
            if ((nums1[i] > nums2[j])) {
                j++;
                continue;
            }
            if ((nums1[i] < nums2[j])) i++;
        }
        int[] arr = new int[l];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = arrayList[k];
        }
        return arr;
    }

}
