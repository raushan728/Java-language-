import java.util.Scanner;

public class Handling_Specific_Exceptions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = scanner.nextInt();

        try {
            int result = numerator / denominator; // This line might throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot divide by zero! Please provide a non-zero denominator.");
            // You could also log e.getMessage() if needed:
            // System.err.println(e.getMessage());
        } finally {
            System.out.println("Division attempt finished.");
            scanner.close();
        }
    }
}
