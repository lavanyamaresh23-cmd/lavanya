package lab1;
import java.util.*;

public class p2 {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("green");   // fixed typo
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        System.out.println(ls);

        // Remove element at index 2
        ls.remove(2);
        System.out.println(ls);

        // Remove element by value
        ls.remove("Blue");
        System.out.println(ls);
    }
}


