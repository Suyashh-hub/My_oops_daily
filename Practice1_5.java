
// Write a java program to detect wheather a number entered by user is integer or not.
import java.util.Scanner;

public class Practice1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("The number entered is an integer: " + number);
        } else {
            System.out.println("The number entered is not an integer.");
        }
        sc.close();
    }
}
