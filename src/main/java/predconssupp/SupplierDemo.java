package predconssupp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo  {
//    @Override Supplier Functional Interface
//    public String get() {
//        return "Hi Sujana";
//    }

    public static void main(String[] args) {
       // Supplier<String> s =()->  "Hi Sujana";
        //System.out.println(s.get());
        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(()->  "Hi Sujana"));
    }
}
