package lab2;

import java.util.Map;
import java.util.TreeMap;

public class P5 {
    public static void main(String[] args) {

        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Apple");
        treeMap.put(2, "Strawberry");
        treeMap.put(3, "Pear");
        treeMap.put(4, "Cucumber");
        treeMap.put(5, "Grapes");

        System.out.println("Iterating over TreeMap (sorted order):");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() +
                               " -> Value: " + entry.getValue());
        }
    }
}