import java.util.Scanner;
public class StarReverseTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = s.nextInt();
        for(int i = n;i>=0;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print('*'+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
