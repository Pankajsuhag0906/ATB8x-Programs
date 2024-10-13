package Tasks.Task_temp;

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
    Person(String myfname, String mylname, int myage, String myGender, float myheight, float myweight, long mymobile,
           String myaddress,long myaadhar, String myoccu ) {
        this.firstname= myfname;
        this.lastname=mylname;
        this.age=myage;
        this.Gender=myGender;
        this.height=myheight;
        this.weight=myweight;
        this.mobile=mymobile;
        this.address=myaddress;
        this.aadhar=myaadhar;
        this.Occupation=myoccu;

    }

    public void Printdetails(){
        System.out.printf("Name = %s",firstname);
        System.out.println();
        System.out.printf("age = %d",age);
        System.out.println();
        System.out.printf("Gender = %s",Gender);
        System.out.println();
        System.out.printf("height = %f",height);
        System.out.println();
        System.out.printf("weight = %f",weight);
        System.out.println();
        System.out.printf("mobile = %d",mobile);
        System.out.println();
        System.out.printf("address = %s",address);
        System.out.println();
        System.out.printf("aadhar = %d",aadhar);
        System.out.println();
        System.out.printf("occuption = %s",Occupation);

    }

    public int printage(){
        return age;
    }
}
