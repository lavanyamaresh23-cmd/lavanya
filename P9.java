package lab2;

import java.util.LinkedHashMap;
import java.util.Map;

public class P9 {
    public static void main(String[] args) {

        System.out.println("=== LinkedHashMap Demonstration ===");

        Map<Integer, String> lMap = new LinkedHashMap<Integer, String>() {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 4; // keep only 4 entries
            }
        };

        lMap.put(1, "Apple");
        lMap.put(2, "Strawberry");
        lMap.put(3, "Pear");
        lMap.put(4, "Cucumber");
        lMap.put(5, "Grapes"); // this will remove key 1

        System.out.println("After inserting 5 elements (only 4 retained):");

        for (Map.Entry<Integer, String> entry : lMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Final LinkedHashMap: " + lMap);
    }
}