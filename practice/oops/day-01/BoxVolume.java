
// Write a program that declares two box objects and assigns values to their length, width, and height. Then, calculate and display the volume of each box.
import java.util.Scanner;

class Box {
    double length;
    double width;
    double height;

    double volume() {
        return length * width * height;
    }
}

public class BoxVolume {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length, width and height of the Box1: ");
        box1.length = sc.nextDouble();
        box1.width = sc.nextDouble();
        box1.height = sc.nextDouble();
        System.out.println("Enter the length, width and height of the Box2: ");
        box2.length = sc.nextDouble();
        box2.width = sc.nextDouble();
        box2.height = sc.nextDouble();
        System.out.println("Volume of Box1: " + box1.volume());
        System.out.println("Volume of Box2: " + box2.volume());
        sc.close();

    }

}
