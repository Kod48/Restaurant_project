package Restaurant;

public class Cashier extends Employee {

    public Cashier(String name) {
        super(name);
        this.operations= new IOOperation[]{
                new Exit(),
                new TakePayment(),
                new ListOrder()
        };
    }

    public Cashier(String name, String surname) {
        super(name, surname);
        this.operations= new IOOperation[]{
                new Exit(),
                new TakePayment(),
                new ListOrder()
        };
    }

    public Cashier(String name, String surname, String ID) {
        super(name, surname, ID);
        this.operations= new IOOperation[]{
                new Exit(),
                new TakePayment(),
                new ListOrder()
        };
    }

    public Cashier(String name, String surname, String ID, String position) {
        super(name, surname, ID, position);
        this.operations= new IOOperation[]{
                new Exit(),
                new TakePayment(),
                new ListOrder()
        };
    }

    public Cashier(String name, String surname, String ID, String position, String salary) {
        super(name, surname, ID, position, salary);
        this.operations= new IOOperation[]{
                new Exit(),
                new TakePayment(),
                new ListOrder()
        };
    }

    @Override
    public String toString() {
        return name+ "<N/>" +surname+ "<N/>" +ID+ "<N/>" +position+ "<N/>" +salary;
    }

    public void menu(Database database, Employee employee) {
        System.out.println("0. Restaurant.Exit");
        System.out.println("1. Take Payment");
        System.out.println("2. List Order");

    }
}
