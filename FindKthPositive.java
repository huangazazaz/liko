package 力扣刷题;

public class FindKthPositive {

    public static void main(String[] args) {
        int [] arr = {1,3};
        int a = findKthPositive(arr,1);
        System.out.println(a);
    }

    public static int findKthPositive(int[] arr, int k) {
        if (arr[k] == arr.length) return arr.length + k;
        if (k < arr[0]) return k;
        int left = 0, right = arr.length - 1, mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] - mid -1 < k && mid - 1 >= 0 && arr[mid - 1] - mid< k){
                left = mid + 1;
            } else if (arr[mid] - mid  - 1>= k && mid + 1 < arr.length && arr[mid - 1] -mid>= k){
                right = mid - 1;
            } else if (arr[mid] - mid -1 >= k && mid - 1 >= 0 && arr[mid - 1] - mid< k){
                return k + mid;
            } else {
                left++;
            }
        }
        return left + k;
    }

}
