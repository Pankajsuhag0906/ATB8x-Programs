package Tasks.Task_14102024;

public class PrintMyBook extends Book {

    public PrintMyBook(String name, String author, double price) {

        super.name=name;
        super.author=author;
        super.price=price;
    }

    @Override
    void getdetails() {
        System.out.printf("name = %s , author =%s, price = %f",name, author, price);

    }
}
