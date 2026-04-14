import java.util.*;

public class Maxsub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxsum = Integer.MIN_VALUE;

        // Brute force approach
        for (int st = 0; st < n; st++) {
            int currsum = 0; // reset here
            
            for (int end = st; end < n; end++) {
                currsum += arr[end];
                maxsum = Math.max(currsum, maxsum);
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxsum);
    }
}