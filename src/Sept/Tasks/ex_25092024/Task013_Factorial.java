package Sept.Tasks.ex_25092024;

import java.util.Scanner;

public class Task013_Factorial {
    public static void main(String[] args) {
        /* Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120 */

        System.out.println("Enter Number:- ");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.printf("Factorial of %d = %d",num,fact);

    }
}
