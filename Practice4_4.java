
// Write a Java Program to find wheather a year entered by the user is a leap year or not.
import java.util.Scanner;

public class Practice4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        // Leap year logic: divisible by 4, but not 100 unless divisible by 400
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeap) {
            System.out.println(year + " is a Leap year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}