class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }
}


/*
Example 1: 
Input: nums = [1,2,3,1] 
Output: true 
Explanation: The element 1 occurs at the indices 0 and 3.
 Example 2: 
 Input: nums = [1,2,3,4] 
 Output: false
 */