public class PrimeNumbers {

    // MOST OPTIMAL prime check (6k ± 1)
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;

        // remove multiples of 2 and 3
        if (n % 2 == 0 || n % 3 == 0) return false;

        // check only 6k ± 1
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    // Print all primes in given range
    static void printPrimesInRange(int left, int right) {
        for (int num = left; num <= right; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 30;

        printPrimesInRange(left, right);
    }
}
