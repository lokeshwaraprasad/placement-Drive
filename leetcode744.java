class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int n = letters.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = letters[i] - target;
        }

        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

      
        if (min == Integer.MAX_VALUE) {
            return letters[0];
        }

        return letters[index];
    }
}
//my approach



//optimal approach
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length;i++){
            if(target<letters[i])
            return letters[i];
        }
        return letters[0];
    }
}