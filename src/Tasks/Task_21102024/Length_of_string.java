package Tasks.Task_21102024;

import org.w3c.dom.ls.LSOutput;

public class Length_of_string {

//    Calculate the length of the String
//  - without using the length() function. String name =”Pramod”; →  6 , CharArray, for loop

    public static void main(String[] args) {

        String s="Pankaj Suhag";
        int length=0;
        for(char c : s.toCharArray())
        {
            length++;

        }
        System.out.println("String length is :"+length);

        //String name="Pankaj Suhag";

//       int count=0;
//       for(int i=0;i<name.length();i++)
//       {
//           count++;
//       }
//
//        System.out.println("Length of name is = "+ count);






    }

}