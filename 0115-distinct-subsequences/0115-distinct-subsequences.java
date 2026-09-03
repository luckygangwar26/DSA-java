public class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (m > n)
            return 0;
        int[] dp = new int[m + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            char cs = s.charAt(i - 1);
            for (int j = m; j >= 1; j--) {
                if (cs == t.charAt(j - 1)) {
                    dp[j] += dp[j - 1];
                }
            }
        }
        return dp[m];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.numDistinct("rabbbit", "rabbit"));
        System.out.println(sol.numDistinct("babgbag", "bag"));
    }
}