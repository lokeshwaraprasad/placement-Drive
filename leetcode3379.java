class Solution {
    public int[] constructTransformedArray(int[] nums) {

        int n=nums.length;
        int []res=new int[n];
       // int mov=0;
       // int index=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                res[i]=0;
                continue;
            }
           // else
            //{
                 int mov=nums[i];
                 int index=(i+mov)%n;
                
            //}
            if(index<0)
            {
                //res[i]=nums[index+n];
                index+=n;
            }



            res[i]=nums[index];
        }
        return res;
        
    }
}