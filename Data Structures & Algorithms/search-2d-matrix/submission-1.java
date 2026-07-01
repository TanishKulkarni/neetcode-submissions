class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*
         1. Set top=0, bot  ROWS-1;
         2. Binary search over the rows:
          - let row = (top + bot) // 2
          - If target is greater than the last element of this row -> move down(top = row + 1)
          - If target is smaller than the first element -> move up (bot = row - 1)
          - otherwise -> the target must be in this row; stop.
         3. If no valid row is found, return false.
         4. Now binary search within the identified row:
          - Use standard binary search to look for the target.
         5. Return true if found, otherwise false
        */

        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int top = 0, bot = ROWS - 1;
        while(top <= bot){
           int row = (top + bot) / 2;
           if(target > matrix[row][COLS - 1]){
            top = row + 1;
           }else if(target < matrix[row][0]){
            bot = row - 1;
           }else{
            break;
           }
        }

        if(!(top <= bot)){
            return false;
        }
        int row = (top + bot) / 2;
        int l = 0, r = COLS - 1;
        while(l <= r){
            int m = (l + r) / 2;
            if(target > matrix[row][m]){
                l = m + 1;
            }else if(target < matrix[row][m]) {
                r = m - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
