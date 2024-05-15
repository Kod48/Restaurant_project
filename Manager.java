package Restaurant;

import Restaurant.Database;
import Restaurant.Employee;

public class Manager extends Employee {

    public Manager(String nameSurname) {
        super(nameSurname);
        this.operations= new IOOperation[]{
                new Exit(),
                new Hire(),
                new Fire(),
                new SalaryUpdate(),
                new ZReport(),
                new Restock(),
                new UpdateMenu()
        };
    }



    public Manager(String nameSurname, String ID) {
        super(nameSurname, ID);
        this.operations= new IOOperation[]{
                new Exit(),
                new Hire(),
                new Fire(),
                new SalaryUpdate(),
                new ZReport(),
                new Restock(),
                new UpdateMenu()
        };
    }

    public Manager(String nameSurname, String ID, String position) {
        super(nameSurname, ID, position);
        this.operations= new IOOperation[]{
                new Exit(),
                new Hire(),
                new Fire(),
                new SalaryUpdate(),
                new ZReport(),
                new Restock(),
                new UpdateMenu()
        };
    }

    public Manager(String nameSurname, String ID, String position, String salary) {
        super(nameSurname, ID, position, salary);
        this.operations= new IOOperation[]{
                new Exit(),
                new Hire(),
                new Fire(),
                new SalaryUpdate(),
                new ZReport(),
                new Restock(),
                new UpdateMenu()
        };
    }

    @Override
    public String toString() {
        return nameSurname+ "<N/>" +ID+ "<N/>" +position+ "<N/>" +salary;
    }

    @Override
    public void menu(Database database, Employee employee) {
        System.out.println("0. Exit");
        System.out.println("1. Hire");
        System.out.println("2. Fire");
        System.out.println("3. Salary Update");
        System.out.println("4. Z Report");
        System.out.println("5. Restock");
        System.out.println("6. Update Menu");
    }
}
