public class Associativity_Operators {
    public static void main(String[] args) {
        // Associativity is used when two operators of the same precedence appear in an expression
        // Precedence & Associativity

        //int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
        // int b = 60/5-34*2;
        
           
        //  System.out.println(b);

        //System.out.println(a);
        //System.out.println(b);

        // Quick Quiz
        // int x =6;
        // int y = 1;
        //  int k = x * y/2;
        //  System.out.println(k);

        int b = 3;
        int c = 5;
        int a = 10;
        int k = b*b - (4*a*c)/(2*a);
        System.out.println(k);

    


    }
}
