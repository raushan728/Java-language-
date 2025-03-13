import java.util.Scanner;

public class MultiDimensional_ArrayGettingInputAndDisplay {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of rows");
        int rows = s.nextInt();
        System.out.println("enter size of column");
        int cols = s.nextInt();
        int [] [] rau= new int [rows] [cols];
        System.out.println("enter elements of matrix");
        for (int i = 0;i<rows;i++)
        {
            for(int j =0;j<cols;j++)
            {
                System.out.printf("elments at position [%d,%d]: ",i+1,j+1);
            
                rau[i] [j] = s.nextInt();
            }
        }
        System.out.println("displaying whatever you enter");
        for(int i=0;i<rows;i++)
        {
            for(int j =0;j<cols;j++)
            {
                System.out.print(rau[i][j] + "\t");
            }
        System.out.println();
        }
        s.close();
    }
}