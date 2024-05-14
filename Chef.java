package Restaurant;

public class Chef extends Employee {

    public Chef(String name) {
        super(name);
        this.operations=new IOOperation[]{
                new Exit(),
                new ListOrder(),
                new PrepareOrder()
        };
    }

    public Chef(String name, String surname) {
        super(name, surname);
        this.operations=new IOOperation[]{
                new Exit(),
                new ListOrder(),
                new PrepareOrder()
        };
    }

    public Chef(String name, String surname, String ID) {
        super(name, surname, ID);
        this.operations=new IOOperation[]{
                new Exit(),
                new ListOrder(),
                new PrepareOrder()
        };
    }

    public Chef(String name, String surname, String ID, String position) {
        super(name, surname, ID, position);
        this.operations=new IOOperation[]{
                new Exit(),
                new ListOrder(),
                new PrepareOrder()
        };
    }

    public Chef(String name, String surname, String ID, String position, String salary) {
        super(name, surname, ID, position, salary);
        this.operations=new IOOperation[]{
                new Exit(),
                new ListOrder(),
                new PrepareOrder()
        };
    }

    @Override
    public String toString() {
        return name+ "<N/>" +surname+ "<N/>" +ID+ "<N/>" +position+ "<N/>" +salary;
    }

    @Override
    public void menu(Database database, Employee employee) {
        System.out.println("0. Restaurant.Exit");
        System.out.println("1. List Order");
        System.out.println("2. Prepare Order");
    }
}
