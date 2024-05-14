package Restaurant;

import Restaurant.Database;
import Restaurant.Employee;

public interface IOOperation {
    public void oper(Database database, Employee employee);
}
