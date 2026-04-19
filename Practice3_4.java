
//Write a java program to detect double and triple spaces in a string by user input.
import java.util.Scanner;

public class Practice3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        boolean hasDoubleSpaces = inputString.contains("  ");
        boolean hasTripleSpaces = inputString.contains("   ");

        if (hasDoubleSpaces) {
            System.out.println("The string contains double spaces.");
        } else {
            System.out.println("The string does not contain double spaces.");
        }

        if (hasTripleSpaces) {
            System.out.println("The string contains triple spaces.");
        } else {
            System.out.println("The string does not contain triple spaces.");
        }
        scanner.close();
    }

}
