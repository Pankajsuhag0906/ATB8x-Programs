package Tasks.Task_25102024;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Rows = ");
        int n=sc.nextInt();
        int space=n-1;
        int k;

        for (int i=1;i<=n;i++)
        {

            for(int s=space;s>=i;s--)
            {
                System.out.print("  ");
            }

           for(k=1;k<=2*i-1;k++)
           {

               System.out.print("* ");
        }

            System.out.println();
        }
    }
}
