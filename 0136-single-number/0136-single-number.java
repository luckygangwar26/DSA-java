class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        if (nums.length < 2) {
            ans = nums[0];
        }else{
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }}
        return ans;
    }
}