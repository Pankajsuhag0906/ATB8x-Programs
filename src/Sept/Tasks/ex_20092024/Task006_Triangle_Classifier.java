package Sept.Tasks.ex_20092024;

import java.util.Scanner;

public class Task006_Triangle_Classifier {
    public static void main(String[] args) {
        System.out.println("Enter Length of First Side: ");
        Scanner obj1=new Scanner(System.in);
        int Side1= obj1.nextInt();
        System.out.println("Enter Length of Second Side: ");
        Scanner obj2=new Scanner(System.in);
        int Side2= obj2.nextInt();
        System.out.println("Enter Length of Third Side: ");
        Scanner obj3=new Scanner(System.in);
        int Side3= obj3.nextInt();

        if(Side1==Side2 && Side1==Side3){
            System.out.println("This is an Equilateral Triangle");
        }
        else if (Side1==Side2 || Side1==Side3|| Side2==Side3) {
            System.out.println("This is an Isosceles Triangle");
        }
        else{
            System.out.println("This is an Scalene Triangle");
        }


    }
}
