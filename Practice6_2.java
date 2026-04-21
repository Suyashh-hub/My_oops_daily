// Write a Program to find out whether a given integer is present in an array or not.

public class Practice6_2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int num = 3;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The integer is present in the array.");
        } else {
            System.out.println("The integer is not present in the array.");
        }

    }

}
