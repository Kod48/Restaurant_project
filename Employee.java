package Restaurant;

public abstract class Employee {
    protected String name;
    protected String surname;
    protected String ID;
    protected String position;
    protected String salary;
    protected IOOperation[] operations;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, String ID) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
    }

    public Employee(String name, String surname, String ID, String position) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.position = position;
    }

    public Employee(String name, String surname, String ID, String position, String salary) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    abstract public String toString();
    abstract public void menu(Database database, Employee employee);
}
