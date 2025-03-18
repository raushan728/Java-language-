import java.util.Scanner;
public class If_Else_Statement {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner s = new Scanner(System.in);
        age = s.nextInt();
        if (age>=18)
        {
            System.out.println("You can drive");
        }
        else
        System.out.println("You are under 18 You can not drive");
        s.close();
    }
}
