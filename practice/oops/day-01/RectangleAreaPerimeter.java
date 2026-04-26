
// Write a program using class rectangle to declare length and breadth and find area and perimeter of rectangle
import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    // Method to calculate area
    double area() {
        return length * breadth;
    }

    // Method to calculate perimeter
    double perimeter() {
        return 2 * (length + breadth);
    }
}

public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.print("Enter the length: ");
        rect.length = sc.nextDouble();

        System.out.print("Enter the breadth: ");
        rect.breadth = sc.nextDouble();

        System.out.println("Area of the rectangle: " + rect.area());
        System.out.println("Perimeter of the rectangle: " + rect.perimeter());

        sc.close();
    }
}
