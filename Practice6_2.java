
// Write a Program to find out whether a given integer is present in an array or not.
import java.util.Scanner;

public class Practice6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The integer is present in the array.");
        } else {
            System.out.println("The integer is not present in the array.");
        }

    }

}
