package Tasks.Task_04102024;

public class Person {
    // Create a Person Class with 10 A, 5 Behavr( All types of Methods)
    // and use the DC and PC to set the values, Create 5 Objects.

    String firstname;
    String lastname;
    int age;
    String Gender;
    float height;
    float weight;
    long mobile;
    String address;
    long aadhar;
    String Occupation;


    Person(){
        System.out.println("This is a default constructor");
    }
    Person(String myfname, String mylname,String mygender,int myage, float myheight, float myweight ) {
        System.out.println("This is parameterize Constructor");
        this.firstname= myfname;
        this.lastname=mylname;
        this.Gender=mygender;
        this.age=myage;
        this.height=myheight;
        this.weight=myweight;

    }
    public long setaadhar(long myaadhar)
    {
        aadhar=myaadhar;
        return aadhar;
    }
    public void setAddress(String myaddress){
        address=myaddress;
    }
    public long setmobile(long mymobile){
        mobile=mymobile;
        return mobile;
    }

    public void setOccupation(String myoccupation) {
        Occupation = myoccupation;
    }

    public void Printdetails(){
        System.out.printf("firstName = %s",firstname);
        System.out.println();
        System.out.printf("lastName = %s",lastname);
        System.out.println();
        System.out.printf("age = %d",age);
        System.out.println();
        System.out.printf("gender = %s",Gender);
        System.out.println();
        System.out.printf("height = %f",height);
        System.out.println();
        System.out.printf("weight = %f", weight);
        System.out.println();
        System.out.printf("address = %s",address);
        System.out.println();
        System.out.printf("occupation = %s",Occupation);
        System.out.println();


    }
}
