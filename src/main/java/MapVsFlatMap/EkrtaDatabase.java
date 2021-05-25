package MapVsFlatMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkrtaDatabase {

    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(101,"john","johnkennedy@gmail.com", Arrays.asList(123456,67890)),
        new Customer(101,"Sujana","Sujanay@gmail.com", Arrays.asList(123456,67890)),
        new Customer(101,"Lavan","Lavan@gmail.com", Arrays.asList(123456,67890)),
        new Customer(101,"Srihitha","Srihitha@gmail.com", Arrays.asList(123456,67890))

        ).collect(Collectors.toList());
    }
}
