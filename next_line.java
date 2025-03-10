import java.util.Scanner;
public class next_line {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your full name");
        String full= s.nextLine();
        System.out.println("your full name is\n"+full);
        s.close();
    }
}
