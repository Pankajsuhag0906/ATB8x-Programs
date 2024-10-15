package Tasks.ex_11102024;

public class BaseTestAPI {

    private String name;
    private int id;

    public BaseTestAPI()
    {
        System.out.println("Base class DC");
    }

    public BaseTestAPI(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void performGET(){
        System.out.println("I am BaseClass performGET");
    }

    public void performPOST(){
        System.out.println("I am BaseClass performPOST");
    }
    public void performPATCH(){
        System.out.println("I am BaseClass performPATCH");
    }
    public void performPUT(){
        System.out.println("I am BaseClass performPUT");
    }
    public void performDELETE(){
        System.out.println("I am BaseClass performDELETE");
    }
}
