package Restaurant;

import Restaurant.*;

import java.util.Scanner;

public class Waiter extends Employee {

    public Waiter(String name) {
        super(name);
    }

    public Waiter(String name, String surname) {
        super(name, surname);
        this.operations= new IOOperation[]{
                new Exit(),
                new ChooseTable(),
                new TakeOrder(),
                new DeleteOrder(),
                new ListOrder(),
                new Serve()
        };
    }

    public Waiter(String name, String surname, String ID) {
        super(name, surname, ID);
        this.operations= new IOOperation[]{
                new Exit(),
                new ChooseTable(),
                new TakeOrder(),
                new DeleteOrder(),
                new ListOrder(),
                new Serve()
        };
    }

    public Waiter(String name, String surname, String ID, String position) {
        super(name, surname, ID, position);
        this.operations= new IOOperation[]{
                new Exit(),
                new ChooseTable(),
                new TakeOrder(),
                new DeleteOrder(),
                new ListOrder(),
                new Serve()
        };
    }

    public Waiter(String name, String surname, String ID, String position, String salary) {
        super(name, surname, ID, position, salary);
        this.operations= new IOOperation[]{
                new Exit(),
                new ChooseTable(),
                new TakeOrder(),
                new DeleteOrder(),
                new ListOrder(),
                new Serve()
        };
    }

    @Override
    public String toString() {
        return name+ "<N/>" +surname+ "<N/>" +ID+ "<N/>" +position+ "<N/>" +salary;
    }

    public void menu(Database database, Employee employee) {
        System.out.println("0. Restaurant.Exit");
        System.out.println("1. Choose Restaurant.Table");
        System.out.println("2. Take Order");
        System.out.println("3. Delete Order");
        System.out.println("4. List Order");
        System.out.println("5. Restaurant.Serve");

        Scanner s =new Scanner(System.in);
        int n= s.nextInt();
        this.operations[n-1].oper(database,employee);
        s.close();

    }
}
