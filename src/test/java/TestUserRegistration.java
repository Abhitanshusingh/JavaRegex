import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {
    UserRegistration validator = new UserRegistration();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = validator.isValidFirstName("Abhi");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnFalse() {
        boolean result = validator.isValidFirstName("abhi");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = validator.isValidLastName("Singh");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnFalse() {
        boolean result = validator.isValidLastName("sInGh");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = validator.isValidEmail("abhitanshusingh99@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnFalse() {
        boolean result = validator.isValidEmail("99@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        boolean result = validator.isValidPhoneNumber("91 1234567890");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnFalse() {
        boolean result = validator.isValidEmail("19123");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMinimumEightCharacterPassword_WhenProper_ShouldReturnTrue() {
        boolean result = validator.isValidPassword("abhi1234");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMinimumEightCharacterPassword_WhenProper_ShouldReturnFalse() {
        boolean result = validator.isValidPassword("ab123");
        Assert.assertFalse(result);
    }

    @Test
    public void givenOneUpperCasePassword_WhenProper_ShouldReturnTrue() {
        boolean result = validator.isOneUpperCaseValidPassword("Abhitanshu");
        Assert.assertTrue(result);
    }

    @Test
    public void givenOneUpperCasePassword_WhenProper_ShouldReturnFalse() {
        boolean result = validator.isOneUpperCaseValidPassword("abhitanshu");
        Assert.assertFalse(result);
    }

    @Test
    public void givenOneNumericPassword_WhenProper_ShouldReturnTrue() {
        boolean result = validator.isOneNumericValidPassword("Abhitanshu99");
        Assert.assertTrue(result);
    }

    @Test
    public void givenOneNumericPassword_WhenProper_ShouldReturnFalse() {
        boolean result = validator.isOneNumericValidPassword("Abhitanshu");
        Assert.assertFalse(result);
    }

    @Test
    public void givenExactlyOneSpecialCharacterPassword_WhenProper_ShouldReturnTrue() {
        boolean result = validator.isSpecialValidPassword("Abhitanshu99@");
        Assert.assertTrue(result);
    }

    @Test
    public void givenExactlyOneSpecialCharacterPassword_WhenProper_ShouldReturnFalse() {
        boolean result = validator.isSpecialValidPassword("Abhitanshu99@@");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailPassword_WhenProper_ShouldReturnTrue() {
        String[] validEmailArray = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com"};
        for (int index = 0; index < validEmailArray.length; index++) {
            boolean result = validator.isValidEmail(validEmailArray[index]);
            Assert.assertTrue(result);
        }
    }

    @Test
    public void givenEmailPassword_WhenProper_ShouldReturnFalse() {
        String[] InvalidEmailArray = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com ", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
        for (int index = 0; index < InvalidEmailArray.length; index++) {
            boolean result = validator.isValidEmail(InvalidEmailArray[index]);
            Assert.assertFalse(result);
        }
    }
}