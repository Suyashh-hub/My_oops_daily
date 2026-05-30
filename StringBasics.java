public class StringBasics {
    public static void main(String[] args) {
        // Creation using literal
        String greeting = "Hello, Java!";

        // 1. Get length
        System.out.println("Length: " + greeting.length()); // Output: 12

        // 2. Change Case
        System.out.println("Uppercase: " + greeting.toUpperCase());
        System.out.println("Lowercase: " + greeting.toLowerCase());

        // 3. Get character at index
        char firstChar = greeting.charAt(0);
        System.out.println("First Character: " + firstChar); // Output: H
    }
}
