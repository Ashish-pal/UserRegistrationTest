package userRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistrationMain validator = new UserRegistrationMain();

    @Test
    public void givenFirstName() throws UserRegistrationException {
        boolean result = validator.checkFirstName("Ashish");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInvalidFirstName() {
        try {
            validator.checkFirstName("ashish");
            Assert.fail("Expected an UserRegistrationException to be thrown");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid first name", e.getMessage());
        }
    }

    @Test
    public void givenLastName() throws UserRegistrationException {
        boolean result = validator.checkLastName("Pal");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInvalidLastName() {
        try {
            validator.checkLastName("pal");
            Assert.fail("Expected an UserRegistrationException to be thrown");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid last name", e.getMessage());
        }
    }

    @Test
    public void givenEmail() throws UserRegistrationException {
        boolean result = validator.checkEmail("ashish.kumar@example.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInvalidEmail() {
        try {
            validator.checkEmail("abc+abc+@gmail.gmail.com");
            Assert.fail("Expected an UserRegistrationException to be thrown");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid email", e.getMessage());
        }
    }
    @Test
    public void givenPassword() throws UserRegistrationException {
        boolean result = validator.checkPassword("Ashish@1223");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInvalidPassword() {
        try {
            validator.checkPassword("1234567654");
            Assert.fail("Expected an UserRegistrationException to be thrown");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid password", e.getMessage());
        }
    }

    @Test
    public void givenMobile() throws UserRegistrationException {
        boolean result = validator.checkMobile("91 1234565439");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInvalidMobile() {
        try {
            validator.checkMobile("1234567654");
            Assert.fail("Expected an UserRegistrationException to be thrown");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Invalid mobile number", e.getMessage());
        }
    }
}