package lab2;


import java.util.LinkedHashMap;
import java.util.Map;

public class P12 {
    public static void main(String[] args) {

        String[] keys = {"C", "A", "B", "E", "D"};
        Integer[] values = {3, 1, 2, 5, 4};

        Map<String, Integer> lMap = new LinkedHashMap<>();

        // Adding elements using loop
        for (int i = 0; i < keys.length; i++) {
            lMap.put(keys[i], values[i]);
        }

        System.out.println("LinkedHashMap (in insertion order): " + lMap);
    }
}