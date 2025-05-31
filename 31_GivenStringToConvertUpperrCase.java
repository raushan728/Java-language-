import java.util.Scanner;
public class GivenStringToConvertUpperrCase {

    public static void main(String[] args) {
        System.out.println("Enter your String");
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        System.out.println("In Upper Csae\n"+st.toUpperCase());
        s.close();
    }
}
