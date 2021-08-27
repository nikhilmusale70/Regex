import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username :- ");
        String name = sc.nextLine();
        System.out.println(validUserName(name));
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
