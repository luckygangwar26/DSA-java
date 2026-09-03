class Solution {
    public String removeStars(String s) {

        char[] result = new char[s.length()];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*') {
                if (j > 0) {
                    j--;
                }
            } else {
                result[j] = c;
                j++;
            }
        }

        return new String(result,0,j);
    }
}