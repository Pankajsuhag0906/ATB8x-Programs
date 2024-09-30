package Sept.Tasks.Task_25092024;

import java.util.Scanner;

public class Task015_Count_vowels_and_consonants {
    public static void main(String[] args) {
        // Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4

        System.out.println("Enter your String: ");
        Scanner obj=new Scanner(System.in);
        String str= obj.next();
        int len= str.length();

        int vowels=0;
        int consonents=0;
       for(int i=0;i<len;i++)
        {

            if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i' || str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                  vowels++;
            }
            else {
                consonents++;
            }
        }
        System.out.printf("Vowels in %s = %d",str,vowels);
        System.out.println();
        System.out.printf("Consonents in %s = %d",str,consonents);


    }
}
