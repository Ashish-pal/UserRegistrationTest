package userRegistration;

import java.util.Scanner;

public class UserRegistrationMain {
    Scanner sc = new Scanner(System.in);

    public boolean checkFirstName() {
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        if (firstName.matches("^[A-Z][a-zA-Z]{2,}$"))
            System.out.println("Valid first name: " + firstName);
        else
            System.out.println("Invalid first name.");
        return false;
    }

    public void checkLastName() {
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        if (lastName.matches("^[A-Z][a-zA-Z]{2,}$"))
            System.out.println("Valid last name: " + lastName);
        else
            System.out.println("Invalid last name.");
    }

    public void checkEmail() {
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"))
            System.out.println("Valid email: " + email);
        else
            System.out.println("Invalid email.");
    }

    public void checkMobileNumber() {
        System.out.print("Enter your mobile number: ");
        String mobile = sc.nextLine();
        if (mobile.matches("^\\d{2} \\d{10}$"))
            System.out.println("Valid mobile: " + mobile);
        else
            System.out.println("Invalid mobile.");
    }

    public void checkPassword() {
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        if (password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8}$"))
            System.out.println("Valid password: " + password);
        else
            System.out.println("Invalid password.");
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