// write a program to find out the day of the week based on the number entered by the user. (1 for Monday, 2 for Tuesday and so on)
import java.util.Scanner;
public class Practice4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-7) to find the corresponding day of the week: ");
        int dayNumber = sc.nextInt();
        String dayOfWeek;

        switch (dayNumber) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Invalid input! Please enter a number between 1 and 7.";
        }

        System.out.println(dayOfWeek);
        sc.close();
    }
    
}
