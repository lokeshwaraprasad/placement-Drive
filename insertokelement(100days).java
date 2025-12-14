/*

📥 Input Format

The first line contains two integers N and K, separated by a space

N → length of the bit stream

K → number of consecutive 1s after which a 0 must be inserted

The second line contains N space-separated integers, each being either 0 or 1, representing the bit stream.

📤 Output Format

Print the modified bit stream after inserting 0 after every K consecutive 1s.

Each value in the output should be separated by a space.

🔒 Boundary Conditions

2 ≤ N ≤ 1000

1 ≤ K ≤ 1000

Each element of the bit stream is either 0 or 1

🧪 Example
Input
12 2
1 0 1 1 0 1 1 0 1 1 1 1

Output
1 0 1 1 0 0 1 1 0 0 1 1 0

📝 Explanation

After the first occurrence of two consecutive 1s → insert 0

The count of consecutive 1s resets after insertion

The process continues until the end of the bit stream

🎯 Objective

Write a program that processes the bit stream in O(N) time and outputs the correctly modified sequence.

If you want, I can also:

Convert this into LeetCode / HackerRank style

input:
12 2
1 0 1 1 0 1 1 0 1 1 1 1


output:

1 0 1 1 0 0 1 1 0 0 1 1 0


*/

//code:

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] brr = new int[n * 2];
        int m = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            brr[m++] = arr[i];

            if (arr[i] == 1) {
                count++;
                if (count == k) {
                    brr[m++] = 0;   
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
