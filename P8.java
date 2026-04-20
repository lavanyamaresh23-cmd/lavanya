package lab2;


import java.util.TreeMap;

public class P8 {
    public static void main(String[] args) {

        TreeMap<String, String> map1 = new TreeMap<>();

        map1.put("C2", "Red");
        map1.put("C1", "Green");
        map1.put("C4", "Black");
        map1.put("C3", "White");

        System.out.println("TreeMap (sorted): " + map1);

        System.out.println("The first key is: " + map1.firstKey());
        System.out.println("The last key is: " + map1.lastKey());
    }
}