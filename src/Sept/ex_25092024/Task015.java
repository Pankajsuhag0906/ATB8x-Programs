package Sept.ex_25092024;

import java.util.Scanner;

public class Task015 {
    public static void main(String[] args) {
        // Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4

        System.out.println("Enter your String: ");
        Scanner obj=new Scanner(System.in);
        String str= obj.next();
        int len= str.length();

        int count=0;
       for(int i=0;i<len;i++)
        {

            if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i' || str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                  count++;
            }
        }
        System.out.printf("Vowels in %s = %d",str,count);


    }
}
