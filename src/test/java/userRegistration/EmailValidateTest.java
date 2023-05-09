package userRegistration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidateTest {
    private String email2Test;
    private boolean expected2Result;

    public EmailValidateTest(String email, boolean expectedResult) {
        this.email2Test = email;
        this.expected2Result = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{{"abc@gmail.com", true},
                {"abc", false},
                {"abc22@gmail.com", true},
                {"abc.11@gmail.com", true},
                {"abc.112.13@gmail.com", true}});
    }

    @Test
    public void EmailShow() throws UserRegistrationException {
        UserRegistrationMain validator = new UserRegistrationMain();
        boolean result = validator.checkEmail(this.email2Test);
        Assert.assertEquals(this.expected2Result, result);
    }
}
