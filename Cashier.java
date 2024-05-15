package Restaurant;

public class Cashier extends Employee {

    public Cashier(String nameSurname) {
        super(nameSurname);
        this.operations= new IOOperation[]{
                new Exit(),
                new TakePayment(),
                new ListOrder()
        };
    }


    public Cashier(String nameSurname, String ID) {
        super(nameSurname, ID);
        this.operations= new IOOperation[]{
                new Exit(),
                new TakePayment(),
                new ListOrder()
        };
    }

    public Cashier(String nameSurname, String ID, String position) {
        super(nameSurname, ID, position);
        this.operations= new IOOperation[]{
                new Exit(),
                new TakePayment(),
                new ListOrder()
        };
    }

    public Cashier(String nameSurname, String ID, String position, String salary) {
        super(nameSurname, ID, position, salary);
        this.operations= new IOOperation[]{
                new Exit(),
                new TakePayment(),
                new ListOrder()
        };
    }

    @Override
    public String toString() {
        return nameSurname+ "<N/>" +ID+ "<N/>" +position+ "<N/>" +salary;
    }

    public void menu(Database database, Employee employee) {
        System.out.println("0. Restaurant.Exit");
        System.out.println("1. Take Payment");
        System.out.println("2. List Order");

    }
}
