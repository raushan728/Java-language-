import java.util.Scanner;
public class SumOfGivenNumberUsingArray {
    public static void main(String[] args) {
        float result =0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size of elements");
        int ele = sc.nextInt();
        float [] sum = new float [ele];
        System.out.println("Enter your elements");
        for(int i=0;i<ele;i++)
        {
          System.out.printf("element at position [%d]",i+1);
         sum [i] = sc.nextFloat();
         result +=sum[i];
        }
        System.out.println("sum is"+" "+result);
        sc.close();
    }
}
