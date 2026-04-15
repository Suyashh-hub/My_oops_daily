
// Use comparision operators to find out whether a given number is greater than the user input number or not. Take the number as input from the user.
import java.util.Scanner;

public class Practice2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num > 10) {
            System.out.println(num + " is greater than 10.");
        } else {
            System.out.println(num + " is not greater than 10.");
        }
    }
}