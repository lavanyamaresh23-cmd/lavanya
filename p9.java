package lab1;

import java.util.*;

public class p9 {
    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.add("Orange");
        ls.add("green");   // fixed typo
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        for (int i = 0; i < ls.size(); i++) {
            System.out.println("Index: " + i + " Value: " + ls.get(i));
        }
    }
}