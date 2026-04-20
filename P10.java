package lab2;


import java.util.LinkedHashMap;
import java.util.Map;

public class P10 {
    public static void main(String[] args) {

        Map<String, Integer> programminglanguages = new LinkedHashMap<>();

        programminglanguages.put("Java", 1995);
        programminglanguages.put("Python", 1991);
        programminglanguages.put("JavaScript", 1995);
        programminglanguages.put("C++", 1985);

        System.out.println("LinkedHashMap (in insertion order): " + programminglanguages);
    }
}