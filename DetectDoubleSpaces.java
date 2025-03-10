import java.util.Scanner;
public class DetectDoubleSpaces {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your string");
        String st = s.nextLine();
        System.out.println(st.indexOf("  "));
        s.close();

    }
}
// You could have used a condition in this. But i have not learned how to apply a condition yet