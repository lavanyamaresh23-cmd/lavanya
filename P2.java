package lab2;


import java.util.HashMap;
import java.util.Map;

// 2. Remove all elements, check size = 0, then add again and check size

public class P2 {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();

        // Adding elements
        hashMap.put(1, "Apple");
        hashMap.put(2, "Strawberry");
        hashMap.put(3, "Pear");
        hashMap.put(4, "Cucumber");
        hashMap.put(5, "Grapes");

        // Display initial size
        System.out.println("Initial size: " + hashMap.size());

        // Remove all elements
        hashMap.clear();
        System.out.println("After removing all elements, size: " + hashMap.size());

        // Add elements again
        hashMap.put(1, "Banana");
        hashMap.put(2, "Orange");
        hashMap.put(3, "Guava");
        hashMap.put(4, "Pomegranate");
        hashMap.put(5, "Amla");

        // Final size
        System.out.println("After adding elements again, size: " + hashMap.size());
    }
}