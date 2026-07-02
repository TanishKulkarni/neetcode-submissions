class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
        Brute Force
         1. Initialize res = 0 to store he maximum length
         2. For each starting index i:
          - Create an empty set charSet
          - Extend the substring by moving j from i forward.
            - if s[j] is already in the set, break
            - Otherwise, add it to the set
          - Update res with size of charSet
         3. Return res after checking all starting positions
        */
        int res = 0;
        for(int i=0; i<s.length(); i++){
            Set<Character> charSet = new HashSet<>();
            for(int j = i; j < s.length(); j++){
                if(charSet.contains(s.charAt(j))) {
                    break;
                }
                charSet.add(s.charAt(j));
            }
            res = Math.max(res, charSet.size());
        }
        return res;
    }
}
