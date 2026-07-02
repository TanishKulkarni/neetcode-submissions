class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
        Sliding Window(optimal)
         1. Create a map mp to store last index of each character
         2. Initialize:
          - l = 0 for the start of the window
          - res = 0 for the longest length
         3. Loop through string with index r:
          - if s[r] is already in mp, move l to mp[s[r]] + 1, but never backward
          - Update mp[s[r]] = r
          - Update the longest length: res = max(res, r - l + 1).
         4. Return res at the end
        */
         HashMap<Character, Integer> mp = new HashMap<>();
        int l = 0;
        int res = 0;

        for (int r = 0; r < s.length(); r++) {
            if (mp.containsKey(s.charAt(r))) {
                l = Math.max(mp.get(s.charAt(r)) + 1, l);
            }
            mp.put(s.charAt(r), r);
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
