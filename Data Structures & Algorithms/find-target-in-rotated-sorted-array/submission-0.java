class Solution {
    public int search(int[] nums, int target) {
        /*
         BRUTE FORCE
         1. Loop through array from left to right 
         2. For each index, compare the element with target
         3. If they match, return that index.
         4. If the loop finishes without a match, return -1.
        */
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
