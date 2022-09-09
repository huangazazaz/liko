package 力扣刷题;

public class isPerfectSquare {
    public static void main(String[] args) {
        boolean a = isPerfectSquare(681);
        System.out.println(a);
    }

    public static boolean isPerfectSquare(int num) {
        if (num==1) return true;
        int left = 2,right = num / 2,mid;
        double nu = num;
        while(left< right-1){
            mid = left + (right - left)/2;
            if(nu/mid==mid) return true;
            if(nu/mid<mid) right= mid;
            if(nu/mid>mid) left = mid;
        }
        if(left*left==num)return true;
        if(right*right==num) return true;
        return false;
    }
}
