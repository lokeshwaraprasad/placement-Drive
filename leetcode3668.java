class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int orderlen=order.length;
        int friendlen=friends.length;
        int idx=0;
        int []res=new int[friendlen];
        for(int i:order)
        {
            for(int j:friends)
            {
                if(i==j)
                {
                    res[idx]=i;
                    idx++;
                }
            }
        }
        return res;
        
    }
}