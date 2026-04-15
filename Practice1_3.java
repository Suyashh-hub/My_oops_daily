
// Here we will take input from the user and print a welcome message using that input.
import java.util.Scanner;

public class Practice1_3 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", welcome to Java programming!");
    }
}
