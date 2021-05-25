package StreamAPI;

import java.util.ArrayList;
import java.util.List;
//DAO LAYER
public class Database {
    public static List<Employee> getEmployees(){
        List<Employee> li = new ArrayList<>();
        li.add(new Employee(1,"Sujana","IT",7000000));
        li.add(new Employee(2,"Lavan","IT",7000000));
        li.add(new Employee(3,"Srihitha","LAW",1000000000));
        li.add(new Employee(4,"Suresh","Business",5000000));

        return li;

    }
}

