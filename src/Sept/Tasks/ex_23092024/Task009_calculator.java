package Sept.Tasks.ex_23092024;

import java.util.Scanner;

public class Task009_calculator {

    /* Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.
      Inputs :   num 1, num 2, +
      Output :  num1+num2 → print information.
   */
    public static void main(String[] args) {

        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Substraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Modulus");

        System.out.println("Enter your Choice: ");
        Scanner ch=new Scanner(System.in);
        int Choice=ch.nextInt();

        System.out.println("Enter First Number: ");
        Scanner obj1=new Scanner(System.in);
        double num1=obj1.nextDouble();

        System.out.println("Enter Second Number: ");
        Scanner obj2=new Scanner(System.in);
        double num2=obj1.nextDouble();
        switch (Choice){

            case 1:
                System.out.printf("%f + %f = %f",num1,num2,num1+num2);
                break;

            case 2:
                System.out.printf("%f - %f = %f",num1,num2,num1-num2);
                break;

            case 3:
                System.out.printf("%f * %f = %f",num1,num2,num1*num2);
                break;

            case 4:
                System.out.printf("%f / %f = %f",num1,num2,num1/num2);
                break;

            case 5:
                System.out.printf("%f modulus %f = %f",num1,num2,num1%num2);
                break;
        }


    }

}

