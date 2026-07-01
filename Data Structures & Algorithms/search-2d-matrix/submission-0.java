class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*
         1. Let r=0(first row) and c = n - 1 (last column)
         2. while r is within bounds and c is within bounds
           - if matrix[r][c] == target, return true
           - if value is greater than the target, move left(c -= 1)
           - if value is smaller, move down (r += 1)

         3. if we exit the matrix, the target is not found -> return false.
        */

        int m = matrix.length, n = matrix[0].length;
        int r = 0, c = n - 1;

        while (r < m && c >= 0) {
            if (matrix[r][c] > target) {
                c--;
            } else if (matrix[r][c] < target) {
                r++;
            } else {
                return true;
            }
        }
        return false;
    }
}
