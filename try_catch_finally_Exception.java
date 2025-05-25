public class try_catch_finally_Exception {

    public static void main(String[] args) {

        System.out.println("Program started.");

        try {
            // This is the code block where an exception might occur.
            int numerator = 10;
            int denominator = 0; // This will cause a 'division by zero' exception

            int result = numerator / denominator; // This line will throw an ArithmeticException

            // This line will not be executed if an exception occurs
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // This 'catch' block executes if an 'ArithmeticException' occurs
            // in the 'try' block.
            System.err.println("\nError: You cannot divide a number by zero.");
            System.err.println("Exception details (message): " + e.getMessage());

            // To print the full stack trace for debugging:
            // e.printStackTrace();
        } finally {
            // The 'finally' block always executes, whether an exception occurred or not.
            // It's typically used to clean up resources (like closing files, network
            // connections).
            System.out.println("\nFinally block executed.");
        }

        System.out.println("Program finished.");
    }
}