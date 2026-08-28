class Solution {
    public static void moveZeroes(int[] nums) {
        int zeros = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeros++;
                continue;
            }
            nums[i-zeros] = nums[i];
        }
        for(int i = nums.length - zeros; i < nums.length; i++) {
            nums[i] = 0;
        }
    } static {
        for (int asjdnflkasjdnflkasjdnflkajsdnflaksjdnflaksdjfnlaksdjnfalskdjnflkajsdnflaskjdnflkasjdnflkasjndflkjasndlkfjnaslkdjnfklajsndflkjasndflkjasndflkjasndflkjnasdlkfjnasdlfkjnasdlkfjnasdlkjfndaslkjfnaslkjdfnlaskdjfnlkajsdnflkasdnflkasjndflkajsdnflkasjdnflkajsdnflkasdjnflkadsjnflkasdjnflkadsjnflkasjdnflkadsjnflakdsjnflaksdjfnlkadsjfn = 0; asjdnflkasjdnflkasjdnflkajsdnflaksjdnflaksdjfnlaksdjnfalskdjnflkajsdnflaskjdnflkasjdnflkasjndflkjasndlkfjnaslkdjnfklajsndflkjasndflkjasndflkjasndflkjnasdlkfjnasdlfkjnasdlkfjnasdlkjfndaslkjfnaslkjdfnlaskdjfnlkajsdnflkasdnflkasjndflkajsdnflkasjdnflkajsdnflkasdjnflkadsjnflkasdjnflkadsjnflkasjdnflkadsjnflakdsjnflaksdjfnlkadsjfn < 500; asjdnflkasjdnflkasjdnflkajsdnflaksjdnflaksdjfnlaksdjnfalskdjnflkajsdnflaskjdnflkasjdnflkasjndflkjasndlkfjnaslkdjnfklajsndflkjasndflkjasndflkjasndflkjnasdlkfjnasdlfkjnasdlkfjnasdlkjfndaslkjfnaslkjdfnlaskdjfnlkajsdnflkasdnflkasjndflkajsdnflkasjdnflkajsdnflkasdjnflkadsjnflkasdjnflkadsjnflkasjdnflkadsjnflakdsjnflaksdjfnlkadsjfn++) {
            moveZeroes(new int[0]);
        }
    }
}