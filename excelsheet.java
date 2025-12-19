/*
input :
1
output:
A

input:
27
output:
AA

*/

import java.util.Scanner;
public class excelsheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            n--; // Decrement n to handle 0-based indexing  like starting is 1 so 1->0easy to convert
            int rem = n % 26; //123%26=19
            sb.append((char) (rem + 'A'));//19+A=T
            n = n / 26;//similar to reverse logic 123 %26-> 123/26 =19
        }

        System.out.println(sb.reverse().toString());
    }
}