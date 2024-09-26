package Sept.Tasks;

import java.util.Scanner;

public class Task012 {
    public static void main(String[] args) {
        // Table of number n = 10, print table with For or while.

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=obj.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d*%d=%d",num,i,num*i);
            System.out.println();
        }

    }
}
