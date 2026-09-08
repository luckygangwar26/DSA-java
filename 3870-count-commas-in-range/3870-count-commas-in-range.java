class Solution {
    public int countCommas(int n) {
        int count = 0;
        if(n<999){
            return count;
        }else{
            count = n - 999;
        }

        return count;
    }
}