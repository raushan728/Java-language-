import java.util.Scanner;
public class UsingMethodMultiplicationTable {
    // Method to print multiplication table
    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d", number, i, number * i);
            System.out.println();
        }
    }
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Example usage of the method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();
        System.out.println("Multiplication table for " + number + ":");
        printMultiplicationTable(number);

    }
}