public class a {
    public static void main(String[] args) {
        String name = "Raushan";
        String name2 = "    kumar   ";
        // int a = name.length();
        // int b = name2.length();

        // System.out.println("this is\n"+name.startsWith("R"));
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println("result message\n"+ name.toUpperCase());

        // String lower = name.toLowerCase();
        // System.out.println(lower);
        // String upper = name.toUpperCase();
        // System.out.println(upper);
        // String notrim = name2.trim();
        // System.out.println("remove space\n"+ name2.trim());

      //  R-0 ,a-1 ,u-2 ,s-3 ,h-4 ,a-5 ,n-6
      //Return a String From Start To End substing(3)
     // Returning shan
       // System.out.println(name.substring(3));
       //in this case start with 2 and end with 5
      // System.out.println(name.substring(2,6));
      // System.out.println(name.replace('R', 's'));
      // System.out.println(name.replace("Rau","Kum" ));
      System.out.println(name.startsWith("Rau"));
      System.out.println(name.endsWith("n"));
    }
}