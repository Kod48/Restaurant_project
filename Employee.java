package Restaurant;

public abstract class Employee {
    protected String nameSurname;
    //protected String surname;
    protected String ID;
    protected String position;
    protected String salary;
    protected String password;
    protected IOOperation[] operations;

    public Employee(String name) {
        this.nameSurname = name;
    }


    public Employee(String name, String ID) {
        this.nameSurname = name;
        //this.surname = surname;
        this.ID = ID;
    }

    public Employee(String name, String ID, String position) {
        this.nameSurname = name;
        //this.surname = surname;
        this.ID = ID;
        this.position = position;
    }

    public Employee(String name, String ID, String position, String salary) {
        this.nameSurname = name;
        //this.surname = surname;
        this.ID = ID;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String nameSurname, String ID, String position, String salary, String password) {
        this.nameSurname = nameSurname;
        this.ID = ID;
        this.position = position;
        this.salary = salary;
        this.password = password;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
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
