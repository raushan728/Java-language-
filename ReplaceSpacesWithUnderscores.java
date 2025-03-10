import java.util.Scanner;
public class ReplaceSpacesWithUnderscores {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Sting");
        String st = s.nextLine();
        System.out.println("With Underscore\n"+st.replace(" ", "_"));
        s.close();
    }
}
