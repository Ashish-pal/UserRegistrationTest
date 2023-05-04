package userRegistration;
import java.util.regex.Pattern;

public class UserRegistrationMain {
    private static final String First_Name_Pattern = "^[A-Z][a-zA-Z]{2,}$";
    private static final String Email_Pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final String Mobile_Pattern = "^\\d{2} \\d{10}$";
    private static final String Password_Pattern = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8}$";

    public boolean checkFirstName() {
        Pattern pattern = Pattern.compile(First_Name_Pattern);
        CharSequence fname = "Ashish";
        if (pattern.matcher(fname).matches()) return true;
        else return false;
    }

    public boolean checkLastName() {
        Pattern pattern = Pattern.compile(First_Name_Pattern);
        CharSequence lname = "Pal";
        if (pattern.matcher(lname).matches()) return true;
        else return false;
    }
    public boolean checkEmail(){
        Pattern pattern = Pattern.compile(Email_Pattern);
        CharSequence email = "abc@gmail.com";
        if (pattern.matcher(email).matches()) return true;
        else return false;
    }

    public boolean checkMobileNumber(){
        Pattern pattern = Pattern.compile(Mobile_Pattern);
        CharSequence mobile = "91 1234567890";
        if (pattern.matcher(mobile).matches()) return true;
        else return false;
    }

    public boolean checkPassword() {
        Pattern pattern = Pattern.compile(Password_Pattern);
        CharSequence passwrd = "12321323";
        if (pattern.matcher(passwrd).matches()) return true;
        else return false;
    }

    public static void main(String[] args) {
        UserRegistrationMain validateUser = new UserRegistrationMain();
        System.out.println("Welcome to User Registration Regex Problem");
        validateUser.checkFirstName();
        validateUser.checkLastName();
        validateUser.checkEmail();
        validateUser.checkMobileNumber();
        validateUser.checkPassword();
    }
}