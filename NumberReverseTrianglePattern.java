import java.util.Scanner;

public class NumberReverseTrianglePattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = s.nextInt();
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
        s.close();
    }

}
