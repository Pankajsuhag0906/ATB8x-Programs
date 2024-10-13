package Tasks.Task_temp;


public class Runnner {
    public static void main(String[] args) {
        Person pankaj=new Person("Pankaj","Suhag",26, "Male",5.8f,
                78,7404482407l,"Vijay Nagar, Rohtak",
                751586282329l,"Student");

        //pankaj.Printdetails();
        int age=pankaj.printage();
        System.out.println(age);
    }
}
