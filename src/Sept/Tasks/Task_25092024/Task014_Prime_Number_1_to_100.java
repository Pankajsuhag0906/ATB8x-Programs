package Sept.Tasks.Task_25092024;

public class Task014_Prime_Number_1_to_100 {
    public static void main(String[] args) {
        // Prime Number from 1 to 100. (for loop)


        for(int i=1; i<=100;i++)
        {
            int count=0;
            for(int j=1;j<=i/2;j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(i);
            }
        }
    }
}
