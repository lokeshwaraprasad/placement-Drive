class Solution {
    public int repeatedNTimes(int[] nums) {
        int len = nums.length;
        int arrsize = len / 2;

        int[] freq = new int[10001];  // FIXED SIZE

        for (int i = 0; i < len; i++) {
            freq[nums[i]]++;
        }

        for (int i = 0; i < 10001; i++) {
            if (freq[i] == arrsize) {
                return i;
            }
        }
        return -1; // FIXED missing return
    }
}
