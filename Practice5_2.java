
//Write a Program to sum first n even numbers using while loop.
import java.util.Scanner;

public class Practice5_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum += 2 * i;
            i++;
        }
        System.out.println("Sum of first " + n + " even numbers is: " + sum);
        sc.close(); // This must be inside the main method
    } // This brace closes the main method
} 