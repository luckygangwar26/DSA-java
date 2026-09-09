class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        char[] ans = new char[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 || j < n2) {
            if (i < n1) {
                ans[k] = word1.charAt(i);
                i++;
                k++;
            }
            if (j < n2) {
                ans[k] = word2.charAt(j);
                j++;
                k++;
            }
        }

        return new String(ans);
    }
}