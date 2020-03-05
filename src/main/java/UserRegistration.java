import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to user registration");
        System.out.println("Enter first name: ");
        Scanner sc=new Scanner(System.in);
        String firstName=sc.next();
        boolean  firstNameResult=isValidFirstName(firstName);
        if(firstNameResult)
            System.out.println("First name is valid");
        else
            System.out.println("First name not valid");

        System.out.println("Enter last name: ");
        String lastName=sc.next();
        boolean  lastNameResult=isValidFirstName(lastName);
        if(lastNameResult)
            System.out.println("last name is valid");
        else
            System.out.println("Last name invalid ");
    }
    //CHECKING VALID OR INVALID FIRST NAME
    public static boolean isValidFirstName(String firstName){
        String firstNamePattern="^[A-Z]{1}[a-z]{2,}$";
        Pattern ptrn = Pattern.compile(firstNamePattern);
        Matcher mchr = ptrn.matcher(firstName);
        return mchr.matches();
    }

    //CHECKING VALID OR INVALID LAST NAME
    public static boolean isValidLastName(String lastName){
        String lastNamePattern="^[A-Z]{1}[a-z]{2,}$";
        Pattern ptrn = Pattern.compile(lastNamePattern);
        Matcher mchr = ptrn.matcher(lastName);
        return mchr.matches();
    }
}