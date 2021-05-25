package predconssupp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo  {
    public static void main(String[] args) {
//        Consumer<Integer> con =(integer) -> System.out.println("Printing:"+ integer);
//        con.accept(10);

        List<Integer> list = Arrays.asList(1,2,3,4);
        list.stream().forEach(integer -> System.out.println("Printing:"+ integer));
    }
}
