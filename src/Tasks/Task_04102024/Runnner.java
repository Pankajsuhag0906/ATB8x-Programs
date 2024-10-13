package Tasks.Task_04102024;


public class Runnner {
    public static void main(String[] args) {
        Person Obj1=new Person("Pankaj","Suhag","Male",26,5.8f,78);


        Obj1.setOccupation("Student");
        Obj1.setAddress("Vijay Nagar, Rohtak");
        Obj1.setaadhar(751586282329l);
        Obj1.setmobile(7404482407l);

        Obj1.Printdetails();

        Person obj2=new Person("Parveen", "Vashist", "Male", 26, 5.10f,80);
        obj2.setOccupation("Fire Operator");
        obj2.setAddress("Shiv Colony, Rohtak");
        obj2.setaadhar(786547854785l);
        obj2.setmobile(9991312466l);

        obj2.Printdetails();








    }
}
