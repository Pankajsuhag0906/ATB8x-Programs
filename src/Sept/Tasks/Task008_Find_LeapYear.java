package Sept.Tasks;

import java.util.Scanner;

public class Task008_Find_LeapYear {

   // Leap Year Program - Find 2024

    public static void main(String[] args) {
        System.out.println("Enter the Year :- ");
        Scanner obj=new Scanner(System.in);
        int year=obj.nextInt();

        if(year%4==0 || year%400==0){
            System.out.println(year + " is a leap year");
        }
        else{

            System.out.println(year + " is a not leap year");
        }

    }
}
