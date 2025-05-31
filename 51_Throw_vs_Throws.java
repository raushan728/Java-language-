class AgeValidator {
    // 'throws' in method signature: this method might throw an Exception
    static void validate(int age) throws Exception {
        if (age < 18) {
            // 'throw' is used to actually throw an exception
            throw new Exception("Age must be at least 18!");
        }
        System.out.println("Age is valid: " + age);
    }
}

public class Throw_vs_Throws {
    public static void main(String[] args) {
        try {
            AgeValidator.validate(16); // This will throw an exception
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            AgeValidator.validate(21); // This will not throw an exception
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
