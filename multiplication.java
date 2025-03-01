import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any two number");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = a * b;
        System.out.println("multiplication is\n" + c);
        s.close();
    }
}
