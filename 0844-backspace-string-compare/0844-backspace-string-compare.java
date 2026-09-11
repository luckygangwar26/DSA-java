class Solution {
    public int check(String str, int in) {
        int count = 0;
        while (in >= 0) {
            if (str.charAt(in) == '#') {
                count++;
                in--;
            } else if (count > 0) {
                count--;
                in--;
            } else {
                break;
            }
        }
        return in;
    }

    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        while (i >= 0 || j >= 0) {
            i = check(s, i);
            j = check(t, j);

            if (i < 0 && j < 0) {
                return true;
            } 
            if (i < 0 || j < 0) {
                return false;
            }
           
             if (s.charAt(i) != t.charAt(j)) {
                return false;
            }
           

            i--;
            j--;
        }
        return true;
    }

    
}