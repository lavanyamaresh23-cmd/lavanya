package lab2;

import java.util.HashMap;
import java.util.Map;

public class P3 {
    public static void main(String[] args) {

        // HashMap1
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Black");

        // HashMap2
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(4, "White");
        map2.put(5, "Blue");
        map2.put(6, "Orange");

        // Copy map1 into map2
        map2.putAll(map1);

        System.out.println("After adding map1 into map2: " + map2);
    }
}