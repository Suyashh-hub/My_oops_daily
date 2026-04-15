
//Program to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken as inout from the keyboard (marks out of 100).
import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects(out of 100): ");
        System.out.println("subject 1: ");
        float s1 = sc.nextFloat();
        System.out.println("subject 2: ");
        float s2 = sc.nextFloat();
        System.out.println("subject 3: ");
        float s3 = sc.nextFloat();
        System.out.println("subject 4: ");
        float s4 = sc.nextFloat();
        System.out.println("subject 5: ");
        float s5 = sc.nextFloat();

        float total = s1 + s2 + s3 + s4 + s5;
        float percentage = (total / 500) * 100;
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        sc.close();

    }

}