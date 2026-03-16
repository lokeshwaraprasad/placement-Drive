//code

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read input as a full line
        String[] parts = sc.nextLine().split("\\s+");
        int n = parts.length;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        // Array to store leaders
        int[] leaders = new int[n];
        int count = 0;

        int max = Integer.MIN_VALUE;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leaders[count++] = arr[i];
            }
        }

        // Print leaders in correct order
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(leaders[i] + " ");
        }
    }
}













/*

Problem: Leaders in an Array
📌 Problem Statement

Given an array of integers, find all the leaders in the array.

An element is said to be a leader if it is greater than all the elements to its right side.
The rightmost element is always a leader.

📥 Input Format

A single line containing space-separated integers (array elements).

The size of the array is not given explicitly.

📤 Output Format

Print all the leader elements in the same order as they appear in the array.

Elements should be separated by a space.

🔒 Constraints

1
≤
𝑁
≤
9999
1≤N≤9999

Array elements can be any valid integers.

input:
10 17 4 3 5 2

output:
17 5 2

*/

//code