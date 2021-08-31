import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name :- ");
        String firstName = sc.nextLine();
        System.out.print("Enter you last name :- ");
        String lastName = sc.nextLine();
        System.out.print("Enter your email id :-");
        String email = sc.nextLine();
        System.out.print("Enter phone number :-");
        String phoneNumber = sc.nextLine();

        if(validUserName(firstName))
            System.out.println("First name is valid");
        else
            System.out.println("First name is invalid");

        if (validUserName(lastName))
            System.out.println("Last name is valid");
        else
            System.out.println("Last name invalid");

        if (emailValidation(email))
            System.out.println("email name is valid");
        else
            System.out.println("email name invalid");

        if (phoneValidation(phoneNumber))
            System.out.println("email name is valid");
        else
            System.out.println("email name invalid");

    }

    public static boolean validUserName(String name){
        String regEx = "^[A-Z][A-Z a-z]\\w{1,10}$";
        Pattern p = Pattern.compile(regEx);

        if (name==null)
            return false;
        Matcher m = p.matcher(name);
        return m.matches();
    }

    public static boolean emailValidation(String email){
        String regEx = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern p = Pattern.compile(regEx);

        if (email == null)
            return false;
        Matcher m = p.matcher(email);
        return m.matches();
    }

    public static boolean phoneValidation(String phoneNumber){
        String regEx = "[0-9]{2}\\s[0-9]{10}";
        Pattern p = Pattern.compile(regEx);

        if (phoneNumber == null)
            return false;
        Matcher m = p.matcher(phoneNumber);
        return m.matches();
    }
    
}
