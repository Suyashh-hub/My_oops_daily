
// write a program to find out wheather a student is pass or fail, if it requires total 40% and above to pass. Assume 3 subjects and take marks as input from user.
import java.util.Scanner;

public class Practice4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 3 subjects:");
        int subject1 = sc.nextInt();
        int subject2 = sc.nextInt();
        int subject3 = sc.nextInt();

        int totalMarks = subject1 + subject2 + subject3;
        double percentage = (totalMarks / 300.0) * 100;

        if (percentage >= 40) {
            System.out.println("Congratulations! You have passed with " + percentage + "%.");
        } else {
            System.out.println("Sorry! You have failed with " + percentage + "%.");
        }

        sc.close();
    }
}