package Sept.ex_28092024;

public class Task_016 {
    // Create a Java program that prints the first 5 even numbers using a do-while loop.

    public static void main(String[] args) {
        int i=1;
        int count=0;
        do {
            if(i%2==0)
            {
                System.out.println(i);
                count++;
            }
            i++;
        }
        while (count<5);
    }
}
