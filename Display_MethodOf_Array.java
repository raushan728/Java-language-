public class Display_MethodOf_Array {
    public static void main(String[] args) {

                /*
                float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
                String [] students ={"Harry", "Rohan", "Shubham", "Lovish"};
                System.out.println(students.length);
                System.out.println(students[2]);
                */
        
                int [] arr = {98, 45, 79, 99, 80};
                // System.out.println(marks.length);
        
                // Displaying the Array (Naive way)
                System.out.println("Printing using Naive way");
                System.out.println(arr[0]);
                System.out.println(arr[1]);
                System.out.println(arr[2]);
                System.out.println(arr[3]);
                System.out.println(arr[4]);
        
                // Displaying the Array (for loop)
                System.out.println("Printing using for loop");
                for(int i=0;i<arr.length;i++){
                    System.out.println(arr[i]);
                }
        
                // Quick Quiz: Displaying the Array in Reverse order (for loop)
                System.out.println("Printing using for loop in reverse order");
                for(int i=arr.length -1;i>=0;i--){
                    System.out.println(arr[i]);
                }
        
                // Quick Quiz: Displaying the Array (for-each loop)
                System.out.println("Printing using for-each loop");
                for(int element: arr){
                    System.out.println(element);
                }
        
            }
        }
        