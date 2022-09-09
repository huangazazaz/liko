package 力扣刷题;

public class SingleNumber {
    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length;i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }

}
