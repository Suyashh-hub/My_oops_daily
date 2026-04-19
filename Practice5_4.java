
// write a Java Program to find factorial of a number entered by the user using for loop.
import java.util.Scanner;

public class Practice5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is : " + fact);
        sc.close();

    }

}
