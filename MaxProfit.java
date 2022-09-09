package 力扣刷题;

public class MaxProfit {
    public int maxProfit(int[] prices) {

        int max = 0, min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }

}
