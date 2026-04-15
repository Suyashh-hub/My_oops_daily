// This program calculates the CGPA based on the marks obtained in three subjects.
public class Practice1_2 {
    public static void main(String[] args) {
        int subject1 = 60;
        int subject2 = 98;
        int subject3 = 76;
        int sum = subject1 + subject2 + subject3;
        float cgpa = (sum / 300.0f) * 10;
        System.out.println("The CGPA is: " + cgpa);

    }

}
