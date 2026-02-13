class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int len=nums.length;
        int []result=new int [len];
        int index=0;
        for(int num:nums)
        {
            if(num<pivot)
            {
                result[index++]=num;
            }
        }
        for(int num:nums)
        {
            if(num==pivot)
            {
                result[index++]=num;
            }
        }
        for(int num:nums)
        {
            if(num>pivot)
            {
                result[index++]=num;
            }
        }
        return result;
        
    }
}