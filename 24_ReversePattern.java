public class ReversePattern {

    // Method to print a reverse pattern of stars
    public static void printReversePattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example usage of the method
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of rows for the reverse pattern: ");
        int n = sc.nextInt();
        System.out.println("Reverse pattern of stars:");
        printReversePattern(n);
        
    }
}
