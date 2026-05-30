
// WAP using class Cube and calculate area using method with parameter
import java.util.Scanner;

class Cube {
    double side;

    void setSide(double s) {
        side = s;
    }

    double calculateArea() {
        return 6 * side * side;
    }
}

public class CubeArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cube cube = new Cube();

        System.out.print("Enter the side length of the cube: ");
        double sideLength = scanner.nextDouble();
        cube.setSide(sideLength);

        double area = cube.calculateArea();
        System.out.println("The surface area of the cube is: " + area);
    }
}
