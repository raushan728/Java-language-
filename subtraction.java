import java.util.Scanner;

public class subtraction {
    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("enter any two number");
        a = s.nextInt();
        b = s.nextInt();
        c = a-b;
        System.out.println("subtraction is\n" +c );
        s.close();
    }
}
