
//Create an array of 5 float values and calculate their sum.
import java.util.Scanner;

public class Practice6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] arr = new float[5];
        System.out.println("Enter 5 float values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextFloat();
        }
        float sum = 0;
        for (float f : arr) {
            sum += f;
        }
        System.out.println("Sum of the float values is: " + sum);
    }
}
