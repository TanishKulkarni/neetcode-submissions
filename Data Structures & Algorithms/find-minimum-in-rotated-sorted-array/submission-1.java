class Solution {
    public int findMin(int[] nums) {
        /*
         BS
         1. initialize left = 0, right = n - 1, store the first element as current answer
         2. while left <= right
          - If current window is already sorted, update answer with nums[left] and stop
          - compute mid
          - update answer with nums[mid]
          - if left half is sorted
            - move search to right half.
          - otherwise
            - search in left half
         3. Return smallest value found.
        */
        int l = 0;
        int r = nums.length - 1;
        int res = nums[0];

        while(l <= r){
            if(nums[l] < nums[r]){
                res = Math.min(res, nums[l]);
                break;
            }

            int m = l + (r - l) / 2;
            res = Math.min(res, nums[m]);
            if(nums[m] >= nums[l]){
                l = m + 1;
            }else {
                r = m - 1;
            }
        }
        return res;
    }
}
