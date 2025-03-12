import java.util.Scanner;

public class GettingInputAndDisplayOfArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Array ka size input lena
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        // Array declare karna
        int[] arr = new int[size];

        // Array ke elements input lena
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Array ke elements display karna
        System.out.println("The elements in the array are:");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            sc.close();
        }
    }
}
