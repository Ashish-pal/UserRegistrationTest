package userRegistration;

import org.junit.Assert;
import org.junit.jupiter.api.*;

public class UserRegistrationTest {
    UserRegistrationMain validator = new UserRegistrationMain();

    @Test
    public void givenFirstName() {
        boolean result = validator.checkFirstName();
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName() {
        boolean result = validator.checkLastName();
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmailAddress() {
        boolean result = validator.checkEmail();
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenMobile() {
        boolean result = validator.checkMobileNumber();
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword() {
        boolean result = validator.checkPassword();
        Assert.assertEquals(true, result);
    }
}