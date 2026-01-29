class Solution {
    public int minOperations(int[] nums, int k) {
        int op=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        op=sum%k;
        return op;
        
    }
}