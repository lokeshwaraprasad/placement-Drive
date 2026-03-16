/*
796. Rotate String
Solved
Easy
Topics
premium lock icon
Companies
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false
 

Constraints:

1 <= s.length, goal.length <= 100
s and goal consist of lowercase English letters.
 
Seen this question in a real interview before?
1/5
Yes
No
Accepted
730,918/1.1M
Acceptance Rate
64.8%
Topics
icon
Companies
Discussion (218)

Choose a type



Copyright © 2025 LeetCode. All rights reserved.

4.7K


218


27 Online
Java
Auto





1234567
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
}





*/

//code:
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
}
