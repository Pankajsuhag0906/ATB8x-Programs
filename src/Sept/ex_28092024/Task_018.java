package Sept.ex_28092024;

public class Task_018 {
    // Give me example of while vs do while loop in Lab ex

    public static void main(String[] args) {

        // Example of While loop while loop is entry controlled loop Condition is check when loop starts

        int i=1;
        while (i<=5)
        {
            System.out.println(i);
            i++;
        }

        // Example of do while loop do while is exit controlled loop. Loop executes one time whether the conditon is false
        int j=1;
        do {
            System.out.println(i);
            i++;
        }
        while (i<=5);
    }
}
