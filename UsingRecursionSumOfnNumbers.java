public class UsingRecursionSumOfnNumbers {
    // Method to calculate the sum of first n natural numbers using recursion
    public static int sumOfNumbers(int n) {
        if (n == 0) {
            return 0; // Base case: sum of 0 is 0
        } else {
            return n + sumOfNumbers(n - 1); // Recursive case
        }
    }
    public static void main(String[] args) {
        // Example usage of the method
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number to calculate the sum of first n natural numbers: ");
        int n = sc.nextInt();
        int sum = sumOfNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        sc.close(); 
        
    }
}
