package Restaurant;
import java.io.File;

import java.util.ArrayList;
public class Database {
    private ArrayList <Employee> employees = new ArrayList<Employee>();
    private ArrayList <String> usernames = new ArrayList<String>();
    private ArrayList <Food> foods = new ArrayList<Food>();
    private ArrayList <String> foodNames = new ArrayList<String>();
    //arrayList for costs of foods

    //private File usersfile = new File(Main.class.getClassLoader().getResource("Users").getFile());



    public int login(String name, String surname, String ID) { //returns a number
        int n = -1; // eşleşme bulamazsa -1
        for(Employee s: employees) { // name ve surname'i almasak
            if (s.getNameSurname().matches(name) && s.getID().matches(ID)){
                n = employees.indexOf(s);// userları tutan arraylistte kaçıncı userda eşleşme buldu
                break;
            }
        }
        return n;// n. indekste eşleşme buldu bulamazsa -1
    }


    public Employee getEmployee(int n) {
        return employees.get(n); // eşleşen userı döndürcek
    }

}
