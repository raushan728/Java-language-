import java.util.Scanner;
public class Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        System.out.println("Enter Yout Fahrenheit Temperature");
        Scanner s = new Scanner(System.in);
        float t = s.nextFloat();
        float c = (t-32)*5/9f;
        System.out.println("Temperature in Celsius:" +c);
        s.close();
    }
}
