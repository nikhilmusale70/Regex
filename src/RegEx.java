import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name :- ");
        String firstName = sc.nextLine();

        System.out.println("Enter you last name");
        String lastName = sc.nextLine();

        if(validUserName(firstName))
            System.out.println("First name is valid");
        else
            System.out.println("First name is not valid");

        if (validUserName(lastName))
            System.out.println("Last name is val");
        else
            System.out.println("Last name invalid");

    }

    public static boolean validUserName(String name){
        String regEx = "^[A-Z][A-Z a-z]\\w{1,10}$";
        Pattern p = Pattern.compile(regEx);

        if (name==null)
            return false;
        Matcher m = p.matcher(name);
        return m.matches();
    }
}
