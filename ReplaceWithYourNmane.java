import java.util.Scanner;
public class ReplaceWithYourNmane {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = "Dear <name>,Thanks a lot";
        System.out.println("Enter your name");
        String sr = s.nextLine();
        System.out.println(st.replace("<name>", sr));
        s.close();
    }
}
