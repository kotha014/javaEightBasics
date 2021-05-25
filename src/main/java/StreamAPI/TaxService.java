package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUsers(String input){
        return input.equalsIgnoreCase("tax")?Database.getEmployees().stream().filter(x -> x.getSalary() > 5000000).collect(Collectors.toList()): Database.getEmployees().stream().filter(x -> x.getSalary() <=5000000).collect(Collectors.toList());

    }
    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("tax"));
        System.out.println(evaluateTaxUsers("non tax"));
    }
}
