
class Solution {
    public void reverseString(char[] s) {
       int l=0;
       char temp;
       int r=s.length-1;
       while(l<r){
        temp=s[l];
        s[l]=s[r];
        s[r]=temp;
        l++;
        r--;
       }
    }

    //functions:
    char[] s = {'h','e','l','l','o'};
new Solution().reverseString(s);
System.out.println(Arrays.toString(s)); // Output: [o, l, l, e, h]
