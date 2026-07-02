class Solution {
    public int maxProfit(int[] prices) {
        /*
         DP
         1. initialize:
          - minBuy as the first price
          - maxP = 0 for the best price
         2. Loop through each price sell:
          - Update maxP with sell - minBuy
          - Update minBuy if we find a smaller price.
         3. Return maxP after scanning all days.
        */

        int maxP = 0;
        int minBuy = prices[0];

        for(int sell : prices){
            maxP = Math.max(maxP, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }
        return maxP;
    }
}
