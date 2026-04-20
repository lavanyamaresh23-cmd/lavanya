package lab2;


import java.util.LinkedHashMap;
import java.util.Map;

public class P11 {
    public static void main(String[] args) {

        Map<String, Integer> programminglanguages = new LinkedHashMap<>();

        programminglanguages.put("Java", 1995);
        programminglanguages.put("Python", 1991);
        programminglanguages.put("JavaScript", 1995);
        programminglanguages.put("C++", 1985);

        for (Map.Entry<String, Integer> entry : programminglanguages.entrySet()) {
            System.out.println(entry.getKey() + " was developed in " + entry.getValue());
        }
    }
}