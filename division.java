import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any two number");
        double a = s.nextInt();
        double b = s.nextInt();
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double c = a / b;
            System.out.println("result is\n" + c);
        }
        s.close();

    }
}
