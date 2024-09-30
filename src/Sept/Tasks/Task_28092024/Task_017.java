package Sept.Tasks.Task_28092024;

public class Task_017 {

    // Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.

    public static void main(String[] args) {
       int i=0;
       int sum=0;
        while (i<=100)
        {
         sum=sum+i;
         i++;
        }

        System.out.printf("Sum of 1 to 100 = %d",sum);
    }
}
