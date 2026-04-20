package lab1;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        System.out.println("=== ArrayList Demonstrations ===");

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("After adding elements: " + arrayList);

        // 2. Adding element at specific index
        arrayList.add(1, "Mango");
        System.out.println("After adding Mango at index 1: " + arrayList);

        // 3. Adding multiple elements
        arrayList.addAll(Arrays.asList("Grape", "Pineapple"));
        System.out.println("After adding multiple elements: " + arrayList);

        // 4. Accessing elements
        String firstFruit = arrayList.get(0);
        System.out.println("First fruit: " + firstFruit);

        // 5. Updating elements
        arrayList.set(1, "Kiwi");
        System.out.println("After updating index 1 to Kiwi: " + arrayList);

        // 6. Removing elements
        arrayList.remove("Orange");
        arrayList.remove(0);
        System.out.println("After removing elements: " + arrayList);

        // 7. Searching elements
        System.out.println("Contains Kiwi? " + arrayList.contains("Kiwi"));
        System.out.println("Index of Grape: " + arrayList.indexOf("Grape"));

        // 8. Size
        System.out.println("List size: " + arrayList.size());

        // 9. Iteration (for-each)
        System.out.println("\nIterating using for-each loop:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // 10. Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        System.out.println("After sorting: " + arrayList);

        // 12. Sublist
        System.out.println("Sublist (0-2): " + arrayList.subList(0, 2));

        // 13. Clearing
        arrayList.clear();
        System.out.println("After clearing: " + arrayList);
    }
}

