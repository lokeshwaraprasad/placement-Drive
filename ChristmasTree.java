public class ChristmasTree {

    public static void main(String[] args) {

        int n = 5;  // height of tree

        // Tree top
        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars (odd numbers)
            for(int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Tree trunk
        for(int i = 1; i <= 2; i++) {

            for(int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }

            System.out.println("*");
        }
    }
}