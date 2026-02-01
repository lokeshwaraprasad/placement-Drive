class Solution {
    public int maxProduct(int[] arr) {
   int first = Integer.MIN_VALUE;
int second = Integer.MIN_VALUE;

int index1 = -1;
int index2 = -1;

for (int i = 0; i < arr.length; i++) {

    if (arr[i] > first) {
        second = first;
        index2 = index1;   

        first = arr[i];
        index1 = i;
    } 
    else if (arr[i] == first && index2 == -1) {
       
        second = arr[i];
        index2 = i;
    }
    else if (arr[i] > second && arr[i] <= first) {
        second = arr[i];
        index2 = i;
    }
}
        int m=arr[index1]-1;
        int h=arr[index2]-1;
       // System.out.print(m + h);
       int res=m*h;
        return res;
    }
}
/*
Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 

Example 1:

Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
Example 2:

Input: nums = [1,5,4,5]
Output: 16
Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16. */