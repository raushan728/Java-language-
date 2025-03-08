public class Special_String {
    public static void main(String[] args) {
        String name = "Raushan";
        String name2 = "    kumar   ";
        // int a = name.length();
        // int b = name2.length();

        // System.out.println("this is\n"+name.startsWith("R"));

//Return length of string
        
        // System.out.println(a);        
        // System.out.println(b);
        // System.out.println("result message\n"+ name.toUpperCase());
   
//convert string to lowerCsae        

        // String lower = name.toLowerCase();
        // System.out.println(lower);

//convert string to upperCsae

        // String upper = name.toUpperCase();
        // System.out.println(upper);

//Remove spases of String

        // String notrim = name2.trim();
        // System.out.println("remove space\n"+ name2.trim());

//  R-0 ,a-1 ,u-2 ,s-3 ,h-4 ,a-5 ,n-6
//Return a String From Start To End substing(3)

     
     //System.out.println(name.substring(3));
     //in this case start with 2 and end with 5
     // System.out.println(name.substring(2,6));


//that will replace string where r and s character are present 

//for character
      // System.out.println(name.replace('R', 's'));

//for string      
      // System.out.println(name.replace("Rau","Kum" ));


//Returning thru or false      
      // System.out.println(name.startsWith("Rau"));
      // System.out.println(name.endsWith("n"));

// Will return the character which index is 3:
      //System.out.println(name.charAt(3));


//Will return the index of which string/char is given.  
     //System.out.println(name.indexOf("au"));
//From index
   // System.out.println(name.indexOf("a",4));  


//returning index from last string.
    //System.out.println(name.lastIndexOf("an"));
//from last index.
    //System.out.println(name.lastIndexOf("a",4));


//returning thru and false by matching the string,
    System.out.println(name.equals("Raushan"));
 
    }
}