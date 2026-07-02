class Solution {
    public int maxProfit(int[] prices) {
        /*
         Two Pointer
         1. Set two pointers:
          - l = 0 (buy day)
          - r = 1 (sell day)
          - maxP = 0 to track maximum profit
         2. While r is within the array:
          - If prices[r] > prices[l], compute the profit and update maxP.
          - otherwise, move l to r (we found a cheaper buy price).
          - Move r to the next day
         3. Return maxP at the end
        */

        int l = 0, r = 1;
        int maxP = 0;

        while(r < prices.length){
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            }else{
                l = r;
            }
            r++;
        }
        return maxP;
    }
}
