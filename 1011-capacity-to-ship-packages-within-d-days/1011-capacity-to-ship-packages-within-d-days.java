class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;

        for (int i = 0; i < weights.length; i++) {
            left = Math.max(left, weights[i]);
            right += weights[i];
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            int day = 1;
            int sum = 0;
            for (int j = 0; j < weights.length; j++) {

                if (sum + weights[j] > mid) {
                    day++;
                    sum = 0;
                }
                sum += weights[j];
            }
            if (day > days) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}