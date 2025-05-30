import java.util.Scanner;

public class Percentage_Finding_Of_Five_Subjects {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your Hindi marks");
        int a = s.nextInt();
        System.out.println("enter your English marks");
        int b = s.nextInt();
        System.out.println("enter your chemistry marks");
        int c = s.nextInt();
        System.out.println("enter your physics marks");
        int d = s.nextInt();
        System.out.println("enter your math marks");
        int e = s.nextInt();
        int total = a + b + c + d + e;
        float p = (total / 500f) * 100;
        System.out.println("percentage is\n" +p);
        s.close();
    }
}
