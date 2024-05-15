package Restaurant;

public class Chef extends Employee {

    public Chef(String nameSurname) {
        super(nameSurname);
        this.operations=new IOOperation[]{
                new Exit(),
                new ListOrder(),
                new PrepareOrder()
        };
    }


    public Chef(String nameSurname, String ID) {
        super(nameSurname, ID);
        this.operations=new IOOperation[]{
                new Exit(),
                new ListOrder(),
                new PrepareOrder()
        };
    }

    public Chef(String nameSurname, String ID, String position) {
        super(nameSurname, ID, position);
        this.operations=new IOOperation[]{
                new Exit(),
                new ListOrder(),
                new PrepareOrder()
        };
    }

    public Chef(String nameSurname, String ID, String position, String salary) {
        super(nameSurname, ID, position, salary);
        this.operations=new IOOperation[]{
                new Exit(),
                new ListOrder(),
                new PrepareOrder()
        };
    }

    @Override
    public String toString() {
        return nameSurname+"<N/>" +ID+ "<N/>" +position+ "<N/>" +salary;
    }

    @Override
    public void menu(Database database, Employee employee) {
        System.out.println("0. Restaurant.Exit");
        System.out.println("1. List Order");
        System.out.println("2. Prepare Order");
    }
}
