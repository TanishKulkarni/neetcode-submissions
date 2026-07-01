class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            int cnt = 1;
            int j = i + 1;
            while(j < n){
                if(temperatures[j] > temperatures[i]){
                    break;
                }
                j++;
                cnt++;
            }
            cnt = (j == n) ? 0 : cnt;
            res[i] = cnt;
        }
        return res;
    }
}
