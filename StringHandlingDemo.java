package lab3;


public class StringHandlingDemo {

    public static void main(String[] args) {

        // String Creation
        System.out.println("=== String Creation and Basic Operations ===");
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Length and Character Access
        System.out.println("\n=== Length and Character Access ===");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 4: " + str1.charAt(4));

        // String Comparison
        System.out.println("\n=== String Comparison ===");
        String str3 = "hello, world!";
        System.out.println("equals: " + str1.equals(str3));
        System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str3));
        System.out.println("compareTo: " + str1.compareTo(str3));

        // String Searching
        System.out.println("\n=== String Searching ===");
        System.out.println("Index of 'World': " + str1.indexOf("World"));
        System.out.println("Last index of 'o': " + str1.lastIndexOf('o'));
        System.out.println("Contains 'Hello': " + str1.contains("Hello"));

        // Substring
        System.out.println("\n=== Substring Operations ===");
        System.out.println("Substring(7): " + str1.substring(7));
        System.out.println("Substring(0,5): " + str1.substring(0, 5));

        // Modification
        System.out.println("\n=== String Modification ===");
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Replace: " + str1.replace("World", "Java"));

        // Whitespace
        System.out.println("\n=== Whitespace Handling ===");
        String space = "  Trimming Example  ";
        System.out.println("Before: '" + space + "'");
        System.out.println("After: '" + space.trim() + "'");

        // Concatenation
        System.out.println("\n=== String Concatenation ===");
        String a = "Hello";
        String b = "World";
        System.out.println(a + " " + b);
        System.out.println(a.concat(" ").concat(b));

        // Splitting
        System.out.println("\n=== String Splitting ===");
        String csv = "Java,Python,C++,JavaScript";
        String[] arr = csv.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Language " + (i + 1) + ": " + arr[i]);
        }

        // StringBuilder
        System.out.println("\n=== StringBuilder Demo ===");
        StringBuilder sb = new StringBuilder();
        sb.append("Learning ").append("Java ").append("Programming");
        System.out.println(sb);

        sb.insert(9, "Core ");
        System.out.println("After insert: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Formatting
        System.out.println("\n=== String Formatting ===");
        String formatted = String.format("Name: %s, Age: %d", "John", 25);
        System.out.println(formatted);

        // Properties
        System.out.println("\n=== String Properties ===");
        String test = "Java123";
        System.out.println("Is empty: " + test.isEmpty());
        System.out.println("Starts with 'Ja': " + test.startsWith("Ja"));
        System.out.println("Ends with '123': " + test.endsWith("123"));

        // Email Validation
        System.out.println("\n=== Email Validation ===");
        String email = "user@example.com";
        System.out.println("Valid: " + validateEmail(email));
    }

    // Email validation function
    public static boolean validateEmail(String email) {
        return email != null &&
                email.contains("@") &&
                email.contains(".") &&
                email.indexOf("@") < email.lastIndexOf(".") &&
                !email.startsWith("@") &&
                !email.endsWith(".") &&
                email.length() >= 5;
    }
}