public class kadanealgoirithm {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxsum = Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<n;i++)
        {
            curr+=arr[i];
            maxsum=Math.max(curr,maxsum);
            if(curr<0)
            {
                curr=0;
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxsum);
    }
} 

