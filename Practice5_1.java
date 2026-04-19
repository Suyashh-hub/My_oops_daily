// Write a PRogram to print the following pattern:
// * * * *  
// * * *
// * *
// *
public class Practice5_1 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Moves to the next line after each row
        }
    }
}
