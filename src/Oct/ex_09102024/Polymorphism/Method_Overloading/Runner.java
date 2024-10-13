package Oct.ex_09102024.Polymorphism.Method_Overloading;

public class Runner {
    public static void main(String[] args) {
        mathOperation obj=new mathOperation();

        int result=obj.sum(5,6,8);
        System.out.println(result);

        int r=obj.sum(60,45);
        System.out.println(r);


    }
}
