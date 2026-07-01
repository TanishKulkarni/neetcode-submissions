class Solution {
    public int findMin(int[] nums) {
        /*
         1. Scan through the entire array.
         2. Track the smallest value seen so far.
         3. After checking every element, return the minimum.
        */
        return Arrays.stream(nums).min().getAsInt();
    }
}
