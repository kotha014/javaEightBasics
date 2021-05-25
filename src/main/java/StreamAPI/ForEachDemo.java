package StreamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
    //filter method---> conditional check


    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("Sujana");
        li.add("Srihita");
        li.add("Lavan");
        li.add("Suresh");
        li.add("Swaroopa");
        li.add("Xmas");
//        for (String s:li) {
//           System.out.println(s);
//        }
        li.stream().forEach((x)->System.out.println(x));
        System.out.println("********FILTER METHOD********");
        li.stream().filter(x->x.startsWith("X")).forEach((x)->System.out.println(x));

        Map<Integer, String > map = new HashMap<>();
        map.put(1,"Sujana");
        map.put(2,"Srihitha");
        map.put(3,"Lavan");
        map.put(4,"Suresh");
        map.put(5,"Swaroopa");
        map.put(6,"Xmas");
        map.forEach((key,value)->System.out.println(key+": "+value));

        map.entrySet().stream().forEach(obj->System.out.println(obj));
        System.out.println("********FILTER METHOD FOR MAP********");
        map.entrySet().stream().filter(x->x.getValue().startsWith("X")).forEach(x->System.out.println(x));


    }
}
