package 力扣刷题;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int[] arr1 = {2,0};
        int[] arr2 = {1};
        merge(arr1, 1, arr2, 1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, nums2.length);
            return;
        }
        int n1 = m - 1, n2 = n - 1, n3 = m + n - 1;
        while (n1 >= 0 & n2 >= 0) {
            if (nums1[n1] > nums2[n2]) {
                nums1[n3] = nums1[n1];
                n1 -= 1;
            } else {
                nums1[n3] = nums2[n2];
                n2 -= 1;

            }
            n3 -= 1;
        }

        if (n1 < 0) {
            for (int i = 0; i <= n2; i++) {
                nums1[i] = nums2[i];
            }
        }
    }

}
