class Solution {
    public boolean canJump(int[] nums) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= maxLen) {
                maxLen = Math.max(maxLen, i + nums[i]);
                if (maxLen >= nums.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
