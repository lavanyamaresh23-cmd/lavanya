package lab2;


import java.util.HashMap;
import java.util.Map;

public class p4 {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();

        // Adding elements
        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Black");
        map1.put(4, "White");
        map1.put(5, "Blue");

        // Check before removing
        System.out.println("Before removing, is map empty? " + map1.isEmpty());

        // Remove all elements
        map1.clear();

        // Check after removing
        System.out.println("After removing, is map empty? " + map1.isEmpty());
    }
}