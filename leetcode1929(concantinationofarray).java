class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int h=n*2;
        int []arr=new int[h];
        int k=0;
        for(int i=0;i<n;i++)
        {
            arr[k++]=nums[i];
        }
         for(int i=0;i<n;i++)
        {
            arr[k++]=nums[i];
        }
        return arr;

        
    }
}