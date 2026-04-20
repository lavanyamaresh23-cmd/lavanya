package lab2;


import java.util.Map;
import java.util.TreeMap;

public class P6 {
    public static void main(String[] args) {

        Map<String, String> map1 = new TreeMap<>();

        map1.put("C1", "Red");
        map1.put("C2", "Green");
        map1.put("C3", "Black");
        map1.put("C4", "White");

        System.out.println("Whether C4 is present: " + map1.containsKey("C4"));
        System.out.println("Whether C5 is present: " + map1.containsKey("C5"));
    }
}