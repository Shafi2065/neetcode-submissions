class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        // Try buying on each day
        for (int i = 0; i < prices.length; i++) {
            // Try selling on each future day
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        
        return maxProfit;
    }
}