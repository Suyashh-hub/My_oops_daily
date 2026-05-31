public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = { 10, 20, 30, 40, 50 };
        int sum = 0;

        // An enhanced 'for-each' loop to iterate through the array
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("The sum of array elements is: " + sum);
    }
}
