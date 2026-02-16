class Solution {
    public int scoreOfString(String s) {
        int len=s.length();
        int sum=0;
        for(int i=0;i<len-1;i++)
        {
            int c=s.charAt(i);
            int t=s.charAt(i+1);

            sum+=Math.abs(c-t);

        }
        return sum;
        
    }
}