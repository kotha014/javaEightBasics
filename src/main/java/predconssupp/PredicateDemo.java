package predconssupp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo  {


    public static void main(String[] args) {
//        Predicate<Integer> pred = integer-> integer %2 ==0;
//        System.out.println(pred.test(7));
        List<Integer> list = Arrays.asList(1,2,3,4);
        list.stream().filter(integer-> integer %2 ==0).forEach(integer -> System.out.println("Print Even:"+ integer));
    }
}
