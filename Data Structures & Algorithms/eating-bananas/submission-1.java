class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        /*
        BRUTE FORCE 
         1. Set the search range
          - left = 1 (min possible speed)
          - right = max(piles) (max needed speed)
         2. while left <= right
          - Let mid be the current speed to test
          - Compute the total hours needed using this speed
         3. if the total hours is within the allowed time h
          - This speed works, so record it
          - Try to find a smaller working speed by searching left half.
         4. Otherwise
          - Speed is too slow, so search in the right half
         5. After the search ends, return smallest valid speed found.
        */
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while(l <= r){
            int k = (l + r) / 2;

            long totalTime = 0;
            for (int p : piles){
                totalTime += Math.ceil((double) p / k);
            }
            if(totalTime <= h){
                res = k;
                r = k - 1;
            }else {
                l = k + 1;
            }
        }
        return res;
    }
}
