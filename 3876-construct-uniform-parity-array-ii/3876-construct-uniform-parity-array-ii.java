class Solution {
    public boolean uniformArray(int[] nums) {

        int min = nums[0];
        int odd = 0;

        for (int i = 0; i < nums.length; i++) {       
            min = Math.min(min, nums[i]);
            odd = odd | (nums[i] & 1);
        }

        return (min & 1) == odd;
    }
}