
// Program to create and convert Kilometers to miles.
import java.util.Scanner;

public class Practice1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers:");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("The distance in miles is: " + miles);
    }
}