package lab1;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("=== LinkedList Demonstrations ===");

        // Adding elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("LinkedList: " + linkedList);

        // First and last element
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        // Add at beginning and end
        linkedList.addFirst("Mango");
        linkedList.addLast("Grapes");

        System.out.println("After addFirst and addLast: " + linkedList);

        // Removing first and last
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("After removing first and last: " + linkedList);
    }
}


