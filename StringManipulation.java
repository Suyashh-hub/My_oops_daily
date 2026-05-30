public class StringManipulation {
    public static void main(String[] args) {
        String text = "  Java Programming  ";

        // 1. Remove leading/trailing whitespace
        String trimmed = text.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // 2. Substring (extracting part of a string)
        String sub = trimmed.substring(0, 4); // From index 0 to 3
        System.out.println("Substring: " + sub); // Output: Java

        // 3. Replace characters
        String replaced = trimmed.replace('a', 'o');
        System.out.println("Replaced: " + replaced); // Output: Jovo Progromming

        // 4. Check if contains sequence
        System.out.println("Contains 'Pro': " + trimmed.contains("Pro")); // true
    }
}
