import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        // String name = new String("Harry");
        // String name = "Harry";
        // System.out.print("The name is: ");
        // System.out.print(name);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f\n", a, b);
        // System.out.format("The value of a is %d and value of b is %f", a, b);
        Scanner sc = new Scanner(System.in);
        // String st = sc.next();
        System.out.println("enter your string");
        String st = sc.nextLine();
        System.out.println(st);
        sc.close();

    }
}
