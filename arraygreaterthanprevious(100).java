import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        System.out.print(max + " ");

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                System.out.print(arr[i] + " ");
                max = arr[i];
            }
        }
    }
}


/*
input
12
1 2 5 7 19 20 12 11 9 15 45

output
1 2 5 7 19 20 45

📌 Description

You are given an array of integers of size N.
Your task is to print all the elements of the array that are strictly greater than all the elements printed before them.

The first element of the array should always be printed.

From the second element onwards, print an element only if it is greater than the maximum value printed so far.

Print the selected elements in the same order as they appear in the array.

📥 Input Format

The first line contains an integer N, the number of elements in the array.

The second line contains N space-separated integers, representing the elements of the array.

📤 Output Format

Print the required elements in a single line, separated by spaces.

🔒 Constraints

1
≤
𝑁
≤
10
5
1≤N≤10
5

−
10
9
≤
𝑎
𝑟
𝑟
[
𝑖
]
≤
10
9
−10
9
≤arr[i]≤10





9 */