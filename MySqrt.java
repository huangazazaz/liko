package 力扣刷题;

public class MySqrt {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1, right = x, mid;
        while (left - right < -1) {
            mid = left + (right - left) / 2;
            if (x / mid > mid) {
                left = mid;
            } else if (x / mid < mid) {
                right = mid;
            } else {
                return mid;
            }
        }
        return left;
    }

}
