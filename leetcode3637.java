class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false; // minimum size needed

        int i = 1;

        // 1️⃣ strictly increasing
        while (i < n && nums[i] > nums[i - 1]) {
            i++;
        }
        if (i == 1) return false; // no increasing part

        // 2️⃣ strictly decreasing
        while (i < n && nums[i] < nums[i - 1]) {
            i++;
        }
        if (i == n || nums[i - 1] >= nums[i - 2]) return false;

        // 3️⃣ strictly increasing again
        while (i < n && nums[i] > nums[i - 1]) {
            i++;
        }

        return i == n;
    }
}
