/*
125. Valid Palindrome
Solved
Easy
Topics
premium lock icon
Companies
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.


*/

//code
class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sen = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char st = s.charAt(i);

            if (st >= 'A' && st <= 'Z') {
                sen.append(Character.toLowerCase(st));
            } 
            else if (st >= 'a' && st <= 'z') {
                sen.append(st);
            }
            else if (st >= '0' && st <= '9') {
                sen.append(st);
            }
        }

        String original = sen.toString();
        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);
    }
}
psvm