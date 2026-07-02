class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
        Sliding Window
         1. Create an empty set charSet and two pointers:
          - l = left edge of the window
          - r = right edge that moves through the string
         2. For each r:
          - While s[r] is already in the set:
            - Remove s[l] from the set and move l right
          - Add s[r] to the set
          - Update the maximum window size : r - l + 1
         3. Return maximum window size found
        */
         HashSet<Character> charSet = new HashSet<>();
        int l = 0;
        int res = 0;

        for (int r = 0; r < s.length(); r++) {
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
