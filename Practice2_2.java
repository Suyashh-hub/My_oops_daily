// Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
public class Practice2_2 {
    public static void main(String[] args) {
        char grade = 'B';
        char encryptedGrade = (char) (grade + 8); // Encrypting the grade by adding 8
        char decryptedGrade = (char) (encryptedGrade - 8); // Decrypting the grade by subtracting 8

        System.out.println("Original Grade: " + grade);
        System.out.println("Encrypted Grade: " + encryptedGrade);
        System.out.println("Decrypted Grade: " + decryptedGrade);
    }
}