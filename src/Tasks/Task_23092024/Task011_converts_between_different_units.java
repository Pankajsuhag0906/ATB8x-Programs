package Tasks.Task_23092024;

import java.util.Scanner;

public class Task011_converts_between_different_units {
    /* Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
            Input. -
    choice - 1 - km → m, km → 1km
    choice - 2 - f → c, f → c */

    public static void main(String[] args) {
        System.out.println("Press 1 to Convert Kilometers to Miles");
        System.out.println("Press 2 to Convert Celsius to Fahrenheit");

        System.out.println("Enter your Choice");
        Scanner ch=new Scanner(System.in);
        int choice=ch.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter Kilometers");
                Scanner k=new Scanner(System.in);
                double km=k.nextDouble();

                double miles=km*0.621371;
                System.out.printf("Miles = %f",miles);
                break;

            case 2:
                System.out.println("Enter Celsius ");
                Scanner Cel=new Scanner(System.in);
                double Celsius=Cel.nextDouble();

                double fahrenhiet= (Celsius * 9/5) + 32;
                System.out.printf("Fahrenhiet= %f",fahrenhiet);
                break;
        }
    }
}
