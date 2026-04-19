// Write a Program to find out the type of website from url entered by the user. (e.g., .com, .org, .in, etc.)
import java.util.Scanner;
public class Practice4_5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a URL: ");
        String url=sc.nextLine();
        if(url.endsWith(".com")){
            System.out.println("This is a commercial website.");
        }else if(url.endsWith(".org")){
            System.out.println("This is an organizational website.");
        }else if(url.endsWith(".in")){
            System.out.println("This is an Indian website.");
        }else{
            System.out.println("This is a website of unknown type.");

        }
        sc.close();
    }
    
}
