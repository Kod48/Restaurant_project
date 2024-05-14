package Restaurant;

import Restaurant.Database;
import Restaurant.Employee;

public class Manager extends Employee {

    public Manager(String name) {
        super(name);
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

    public Manager(String name, String surname) {
        super(name, surname);
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

    public Manager(String name, String surname, String ID) {
        super(name, surname, ID);
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

    public Manager(String name, String surname, String ID, String position) {
        super(name, surname, ID, position);
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

    public Manager(String name, String surname, String ID, String position, String salary) {
        super(name, surname, ID, position, salary);
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
        return name+ "<N/>" +surname+ "<N/>" +ID+ "<N/>" +position+ "<N/>" +salary;
    }

    @Override
    public void menu(Database database, Employee employee) {
        System.out.println("0. Restaurant.Exit");
        System.out.println("1. Restaurant.Hire");
        System.out.println("2. Restaurant.Fire");
        System.out.println("3. Salary Update");
        System.out.println("4. Z Report");
        System.out.println("5. Restaurant.Restock");
        System.out.println("6. Update Menu");
    }
}
