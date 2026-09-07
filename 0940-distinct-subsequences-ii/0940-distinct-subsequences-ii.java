class Solution {
    public int distinctSubseqII(String s) {
        int mod = 1000000007;
        long total = 1;
        long[] last = new long[26];

        for (char c : s.toCharArray()) {
            int index = c - 'a';

            long newTotal = (total * 2 - last[index] + mod) % mod;

            last[index] = total;
            total = newTotal;
        }

        return (int) ((total - 1 + mod) % mod);
    }
}