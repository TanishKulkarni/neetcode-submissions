class Solution {
    public int characterReplacement(String s, int k) {
        /*
        BRUTE FORCE
         1. Initialize res = 0 to store longest valid window
         2. For each starting index i:
          - Create an empty frequency map and set maxf = 0
          - Extend substring by increasing j from i to the end
            - Update frequency of s[j]
            - Update maxf 
            - if window size minus maxf is <= k, it is valid
              - Update res with the window size
         3. Return res after testing all starting positions.
        */
        int res = 0;
        for(int i=00; i<s.length(); i++){
            HashMap<Character, Integer> count = new HashMap<>();
            int maxf = 0;
            for(int j=i; j < s.length(); j++){
                count.put(s.charAt(j), count.getOrDefault(s.charAt(j), 0) + 1);
                maxf = Math.max(maxf, count.get(s.charAt(j)));
                if((j - i + 1) - maxf <= k){
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }
}
