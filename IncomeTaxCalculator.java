
// calculate income tax paid by an employee to the government as per the slabs mentioned below:
// Income Slab (in Rs.)    Tax Rate
//2.5 Lakh - 5 Lakh         5%
//5 Lakh - 10 Lakh          20% 
//Above 10 Lakh              30%
//Note: There is no tax for income below 2.5 Lakh. take input from user and print the total tax paid by the employee.
import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your annual income in Rs.: ");
        double income = scanner.nextDouble();
        double tax = calculateTax(income);
        System.out.println("Total tax paid by the employee: Rs. " + tax);
        scanner.close();
    }

    public static double calculateTax(double income) {
        double tax = 0.0;
        if (income > 1000000) {
            tax += (income - 1000000) * 0.30; // Tax for income above 10 Lakh
            income = 1000000; // Reduce income to 10 Lakh for next slab calculation
        }
        if (income > 500000) {
            tax += (income - 500000) * 0.20; // Tax for income between 5 Lakh and 10 Lakh
            income = 500000; // Reduce income to 5 Lakh for next slab calculation
        }
        if (income > 250000) {
            tax += (income - 250000) * 0.05; // Tax for income between 2.5 Lakh and 5 Lakh
        }
        return tax;
    }
}