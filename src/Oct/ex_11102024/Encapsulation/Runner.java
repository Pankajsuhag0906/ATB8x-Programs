package Oct.ex_11102024.Encapsulation;

public class Runner {

    public static void main(String[] args) {
        ClassA obj=new ClassA(10,55);

        obj.setA(12);
        obj.setB(13);

        System.out.println(obj.getA());
        System.out.println(obj.getB());
    }
}
