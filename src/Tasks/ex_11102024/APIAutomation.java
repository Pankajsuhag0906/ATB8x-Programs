package Tasks.ex_11102024;

public class APIAutomation {
    public static void main(String[] args) {
        BaseTestAPI obj = new TestCaseAPI();

        obj.setName("SAhil");
        System.out.println(obj.getName());
        obj.performGET();
    }
}
