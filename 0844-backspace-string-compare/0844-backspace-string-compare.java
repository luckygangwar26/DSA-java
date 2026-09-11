class Solution {
    public boolean backspaceCompare(String s, String t) {

        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        int max = (sarr.length + tarr.length)-2;

        for (int i = 0; i <= max; i++) {

            if (i < sarr.length && sarr[i] == '#') {
                sarr[i] = 0;

                int j = i - 1;
                while (j >= 0) {
                    if (sarr[j] != 0) {
                        sarr[j] = 0;
                        break;
                    }
                    j--;
                }
            }

            if (i < tarr.length && tarr[i] == '#') {
                tarr[i] = 0;

                int j = i - 1;
                while (j >= 0) {
                    if (tarr[j] != 0) {
                        tarr[j] = 0;
                        break;
                    }
                    j--;
                }
            }
        }

        String a = new String(sarr).replace("\0", "");
        String b = new String(tarr).replace("\0", "");

        return a.equals(b);
    }
}