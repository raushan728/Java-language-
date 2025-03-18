import java.util.Scanner;
public class next {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter yiur first name");
        String first = s.next();
        System.out.println("enter your last name");
        String last = s.next();
        System.out.println("your full name is\n" +first +" "+last);
        s.close();
    }
    
}
