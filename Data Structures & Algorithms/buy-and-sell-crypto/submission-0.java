class Solution {
    public int maxProfit(int[] prices) {
        /*
         BRUTE FORCE
         1. Initialize res = 0 to store maximum profit
         2. Loop through each day i as the buy day.
         3. For each buy day, loop through each day j > i as the sell day
         4. Calculate profit prices[j] - prices[i] and update res.
         5. Return res after checking all pairs.
        */

        int res = 0;
        for(int i=0; i<prices.length; i++){
            int buy = prices[i];
            for(int j = i + 1; j < prices.length; j++){
                int sell = prices[j];
                res = Math.max(res, sell - buy);
            }
        }
        return res;
    }
}
