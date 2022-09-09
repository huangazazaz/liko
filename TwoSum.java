package 力扣刷题;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int left = i+1, right = numbers.length-1, mid;
            while (left < right - 1) {
                mid = left + (right - left) / 2;
                if (numbers[i] + numbers[mid] == target) {
                    arr[0] = i + 1;
                    arr[1] = mid + 1;
                    return arr;
                }
                if (numbers[i] + numbers[mid] < target) {
                    left = mid + 1;
                }
                if (numbers[i] + numbers[mid] > target) {
                    right = mid - 1;
                }
            }
            if (numbers[i] + numbers[left]==target) return new int[]{i+1,left+1};
            if (numbers[i] + numbers[right]==target) return new int[]{i+1,right+1};
        }
        return arr;

    }
}