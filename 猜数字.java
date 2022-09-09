//package 力扣刷题;
//
//public class 猜数字 {
//    public int guessNumber(int n) {
//        int first = 1, last = n, mid;
//
//        while (first < last) {
//            mid = (first + last) / 2;
//            if (guess(mid) < 0) {
//                first = mid + 1;
//            } else if (guess(mid) > 0) {
//                last = mid - 1;
//            } else {
//                return mid;
//            }
//        }
//        return mid;
//    }
//}
