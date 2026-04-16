// Write a java program to fill in a letter template which looks like below:
// Letter template: "Dear <|name|>, Thanks a lot"
public class Practice3_3 {
    public static void main(String[] args) {
        String name = "Suyash";
        String letterTemplate = "Dear <|name|>, Thanks a lot";
        String personalizedLetter = letterTemplate.replace("<|name|>", name);
        System.out.println(personalizedLetter);
    }

}
