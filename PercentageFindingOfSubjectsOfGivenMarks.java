import java.util.Scanner;

public class PercentageFindingOfSubjectsOfGivenMarks {
    public static void main(String[] args) {
        float tol = 0f;
        System.out.println("How many your subjects");
        Scanner sc = new Scanner(System.in);
        int sub = sc.nextInt();
        int[] marks = new int[sub];
        System.out.println("enter your marks one-by-one");
        for (int i = 0; i < sub; i++) {
            marks[i] = sc.nextInt();
            tol += marks[i];
        }
        float per = ( tol / (sub * 100)) * 100f;
        System.out.println("Your Percentage is :" + " " + per);
        sc.close();
    }
}
