// Write the following expressio in a given program: v^2-u^2/2as
public class Practice2_4 {
    public static void main(String[] args) {
        double v = 10.0; // final velocity
        double u = 5.0; // initial velocity
        double a = 2.0; // acceleration
        double s = 15.0; // distance

        double result = (Math.pow(v, 2) - Math.pow(u, 2)) / (2 * a * s);
        System.out.println("The result of the expression v^2 - u^2 / (2as) is: " + result);
    }
}