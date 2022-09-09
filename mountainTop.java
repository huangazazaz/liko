package 力扣刷题;

import java.util.Arrays;

public class mountainTop {

    public static void main(String[] argh) {
        int[] arrs = {7, 2, 1, 0};
        Arrays.sort(arrs);
        System.out.println(Arrays.toString(arrs));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1, mid;
        while (right - left > 1) {
            mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (arr[left] > arr[right]) {
            return left;
        } else {
            return right;
        }
    }

}
