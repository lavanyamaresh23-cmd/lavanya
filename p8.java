package lab1;

import java.util.*;

public class p8 {
    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.add("Orange");
        ls.add("green");   // fixed typo
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        System.out.println(ls);

        // Adding element at the end
        ls.addLast("pink");
        System.out.println(ls);
    }
}

