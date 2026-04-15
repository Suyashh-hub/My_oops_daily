// What will be the result of the following expression: float a = 7/4* 9/2;
public class Practice2_1 {
    public static void main(String[] args) {
        float a = 7 / 4 * 9 / 2;
        float b = 7 / 4.0f * 9 / 2.0f;// To get the correct result, at least one of the numbers in the division should
                                      // be a float.
        System.out.println(a);
        System.out.println(b);
    }
}