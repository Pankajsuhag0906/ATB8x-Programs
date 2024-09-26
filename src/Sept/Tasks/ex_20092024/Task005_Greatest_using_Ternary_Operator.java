package Sept.Tasks.ex_20092024;

import java.util.Scanner;

public class Task005_Greatest_using_Ternary_Operator {
    public static void main(String[] args) {
       /* By using Ternary Operators max between 3 numbers.
         Input int - a,b,c - a = 10, b = 20, c = 45 */

        System.out.println("Enter First Number: ");
        Scanner obj1=new Scanner(System.in);
        int A= obj1.nextInt();
        System.out.println("Enter Second Number: ");
        Scanner obj2=new Scanner(System.in);
        int B= obj2.nextInt();
        System.out.println("Enter Third Number: ");
        Scanner obj3=new Scanner(System.in);
        int C= obj3.nextInt();


        int max= A>B?(A>C?A:C):(B>C?B:C);
        System.out.println(max + " is Greater");


    }
}
