package lab2;


import java.util.Map;
import java.util.TreeMap;

public class P7 {
    public static void main(String[] args) {

        Map<Integer, String> treeMap = new TreeMap<>();

        // Adding elements
        treeMap.put(1, "Apple");
        treeMap.put(2, "Strawberry");
        treeMap.put(3, "Pear");
        treeMap.put(4, "Cucumber");
        treeMap.put(5, "Grapes");

        // Initial size
        System.out.println("Initial size: " + treeMap.size());

        // Clear all elements
        treeMap.clear();
        System.out.println("After removing all elements, size: " + treeMap.size());

        // Add new elements
        treeMap.put(1, "Banana");
        treeMap.put(2, "Orange");
        treeMap.put(3, "Guava");
        treeMap.put(4, "Pomegranate");
        treeMap.put(5, "Amla");

        // Final size
        System.out.println("After adding elements again, size: " + treeMap.size());
    }
}