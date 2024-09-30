package Sept.Tasks.Task_13092024;

import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        System.out.print("Enter first Number = ");
        System.out.println();
        Scanner obj1=new Scanner(System.in);
        double num1=obj1.nextDouble();
        System.out.print("Enter Second Number = ");
        System.out.println();
        Scanner obj2=new Scanner(System.in);
        double num2=obj2.nextDouble();

        System.out.printf("%f + %f = %f ",num1,num2,num1+num2);
        System.out.println();
        System.out.printf(" %f - %f = %f",num1,num2,num1-num2);
        System.out.println();
        System.out.printf(" %f / %f = %f ",num1,num2,num1/num2);
        System.out.println();
        System.out.printf(" %f Modulus %f = %f ",num1,num2,num1%num2);

    }
}
