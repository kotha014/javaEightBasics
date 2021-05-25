package StreamAPI;

import java.util.*;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        li.add(8);
        li.add(12);
        li.add(13);
        li.add(14);
        List<Employee> employee = Database.getEmployees();

        employee.stream().sorted((o1,o2)-> o2.getSalary()- o1.getSalary()).forEach(System.out::println);

//        Collections.sort(li);
//        Collections.reverse(li);
//        System.out.println(li);
   //     li.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));


//        Map<String , Integer> map = new HashMap<>();
//        map.put("eight",8);
//        map.put("four",4);
//        map.put("ten",10);
//        map.put("two",2);
//
        Map<Employee, Integer> employeeMap = new TreeMap<>((o1,o2)->(int)(o2.getSalary()-o1.getSalary()));
        employeeMap.put(new Employee(176,"Sujana","IT",60000),60);
        employeeMap.put(new Employee(176,"Lavan","IT",60000),60);
        employeeMap.put(new Employee(176,"Srihitha","LAW",10000000),60);
        employeeMap.put(new Employee(176,"Suresh","Business",60000),60);
        employeeMap.put(new Employee(176,"Swaroopa","CHEF",90000),60);


//        for(Map.Entry<String, Integer> entry : entries){
//            System.out.println(entry.getKey()+" "+ entry.getValue());
//        }
//
//        map.entrySet().stream().sorted((Map.Entry.comparingByKey())).forEach(System.out::println);
//        System.out.println("*********************************************");
//        map.entrySet().stream().sorted((Map.Entry.comparingByValue())).forEach(System.out::println);

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept))).forEach(System.out::println);
    }
}
