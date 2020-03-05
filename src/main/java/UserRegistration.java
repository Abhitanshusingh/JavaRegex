import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to user registration");
        System.out.println("Enter first name: ");
        Scanner sc=new Scanner(System.in);
        String userInput=sc.next();
        boolean  result=isValidFirstName(userInput);
        if(result)
            System.out.println("First name is valid");
        else
            System.out.println("First name not valid");
    }
    //CHECKING VALID OR INVALID FIRST NAME
    public static boolean isValidFirstName(String firstName){
        String firstNamePattern="^[A-Z]{1}[a-z]{2,}$";
        Pattern ptrn = Pattern.compile(firstNamePattern);
        Matcher mchr = ptrn.matcher(firstName);
        return mchr.matches();
    }
}