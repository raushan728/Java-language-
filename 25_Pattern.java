public class Pattern {
    // Method to print a pattern of stars
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Example usage of the method
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int n = sc.nextInt();
        System.out.println("Pattern of stars:");
        printPattern(n);
        sc.close();
    }
}
