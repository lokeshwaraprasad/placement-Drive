import java.util.*;

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int x = nums.get(i); // use get() for List
            int a = 0;

            // Try all candidates from 0 to x
            for (int candidate = 0; candidate <= x; candidate++) {
                if ((candidate | (candidate + 1)) == x) {
                    a = candidate;
                    break;
                }
            }

            // If no candidate works
            if ((a | (a + 1)) != x) a = -1;

            ans[i] = a;
        }

        return ans;
    }

    // Optional: test
    public static void main(String[] args) {
        Solution sol = new Solution();
        List<Integer> nums = Arrays.asList(7, 13, 3, 1);
        int[] ans = sol.minBitwiseArray(nums);
        System.out.println(Arrays.toString(ans)); // [3, 12, 2, 0]
    }
}
