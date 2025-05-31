// Custom annotation definition
@interface Info {
    String author();
    int version();
}

// Parent class
class Parent {
    public void showMessage(String msg) {
        System.out.println("Parent says: " + msg);
    }

    /**
     * This method is deprecated and should not be used in new code.
     */
    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated.");
    }
}

// Child class with annotations
@Info(author = "Amit", version = 1)
class Child extends Parent {

    /**
     * Overrides the showMessage method from Parent class.
     */
    @Override
    public void showMessage(String msg) {
        System.out.println("Child says: " + msg);
    }

    /**
     * Uses the deprecated oldMethod from Parent class.
     * Suppresses the deprecation warning.
     */
    @SuppressWarnings("deprecation")
    public void useOldMethod() {
        oldMethod(); // Calling the deprecated method
    }
}

// Main class to run the example
public class Annotations {
    public static void main(String[] args) {
        Child c = new Child();

        // Demonstrate @Override annotation
        c.showMessage("Hello!");

        // Demonstrate @SuppressWarnings with deprecated method
        c.useOldMethod();
    }
}
