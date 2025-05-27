public class Nested_try_catch {

    public static void main(String[] args) {

        String text = null; // This will cause NullPointerException later
        int[] numbers = { 10, 0 }; // 0 at index 1 for division by zero

        System.out.println("Starting program...");

        try { // Outer try block
            System.out.println("  Inside outer try block.");

            // This line might cause NullPointerException if 'text' is null
            // For testing, let's make it null. If you set text = "hello", this won't
            // happen.
            System.out.println("  Length of text: " + text.length());

            try { // Inner try block
                System.out.println("    Inside inner try block.");

                // This line might cause ArithmeticException if numbers[1] is 0
                int result = numbers[0] / numbers[1]; // 10 / 0
                System.out.println("    Result of division: " + result);

            } catch (ArithmeticException e) {
                System.err.println("    Inner catch: ArithmeticException caught! " + e.getMessage());
            } finally {
                System.out.println("    Inner finally block executed.");
            }

            System.out.println("  End of outer try block.");

        } catch (NullPointerException e) {
            System.err.println("Outer catch: NullPointerException caught! " + e.getMessage());
        } catch (Exception e) { // General catch for any other unexpected errors in outer block
            System.err.println("Outer catch: An unexpected error occurred! " + e.getMessage());
        } finally {
            System.out.println("Outer finally block executed.");
        }

        System.out.println("Program finished.");
    }
}
