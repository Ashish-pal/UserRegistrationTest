package userRegistration;
import java.util.regex.Pattern;

public class UserRegistrationMain {
    private static final String First_Name_Pattern = "^[A-Z][a-zA-Z]{2,}$";
    private static final String Email_Pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final String Mobile_Pattern = "^\\d{2} \\d{10}$";
    private static final String Password_Pattern = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8}$";

    public boolean checkFirstName(String fname) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(First_Name_Pattern);
        if (pattern.matcher(fname).matches()) return true;
        else throw new UserRegistrationException("Invalid first name");
    }

    public boolean checkLastName(String lname) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(First_Name_Pattern);
        if (pattern.matcher(lname).matches()) return true;
        else throw new UserRegistrationException("Invalid last name");
    }

    public boolean checkEmail(String email) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(Email_Pattern);
        if (pattern.matcher(email).matches()) return true;
        else throw new UserRegistrationException("Invalid email");
    }

    public boolean checkMobile(String mobile) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(Mobile_Pattern);
        if (pattern.matcher(mobile).matches()) return true;
        else throw new UserRegistrationException("Invalid mobile number");
    }

    public boolean checkPassword(String password) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(Password_Pattern);
        if (pattern.matcher(password).matches()) return true;
        else throw new UserRegistrationException("Invalid password");
    }
}