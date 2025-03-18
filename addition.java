import java.util.Scanner;
public class addition
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;
        System.out.println("Sum of two numbers is");
        System.out.println(c);
        s.close();
    }
}