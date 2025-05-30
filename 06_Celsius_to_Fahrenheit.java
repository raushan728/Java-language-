import java.util.Scanner;

public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter celsius");
        byte a = s.nextByte();
        float f = (a * 9 / 5f) + 32;
        System.out.println("fahrenheit\n" + f);
        s.close();
    }
}
