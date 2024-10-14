package Oct.ex_11102024.Super_and_this;

public class B extends Base{

    B(){
        super(10,20);
        this.display();

    }

    void display()
    {
        System.out.println("I am Class B function");
    }


}
