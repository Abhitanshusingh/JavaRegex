import org.junit.Assert;
import org.junit.Test;
public class TestUserRegistration {
    UserRegistration validator = new UserRegistration();

    //TEST CASE FOR VALID FIRST NAME
    @Test
    public void firstNameValid() {
        boolean result = validator.isValidFirstName("Abhi");
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID VALID FIRST NAME
    @Test
    public void firstNameInvalid() {
        boolean result = validator.isValidFirstName("abhi");
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID LAST NAME
    @Test
    public void lastNameValid() {
        boolean result = validator.isValidLastName("Singh");
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID VALID LAST NAME
    @Test
    public void lastNameInvalid() {
        boolean result = validator.isValidLastName("sInGh");
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID EMAIL
    @Test
    public void isemailalid() {
        boolean result = validator.isValidEmail("abhitanshusingh99@gmail.com");
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID VALID EMAIL
    @Test
    public void isemailInvalid() {
        boolean result = validator.isValidEmail("99@gmail.com");
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID PHONE NUMBER
    @Test
    public void isPhobneNumberVlalid() {
        boolean result = validator.isValidPhoneNumber("91 1234567890");
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID PHONE NUMBER
    @Test
    public void isPhoneNumberInvalid() {
        boolean result = validator.isValidEmail("19123");
        Assert.assertFalse(result);
    }
    //TEST CASE FOR VALID PASSWORD MINIMUM 8 CHARACTER
    @Test
    public void isPasswordVlalid() {
        boolean result = validator.isValidPassword("abhi1234");
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID PASSWORD MINIMUM 8 CHARACTER
    @Test
    public void isPasswordInvalid() {
        boolean result = validator.isValidPassword("ab123");
        Assert.assertFalse(result);
    }
    //TEST CASE FOR VALID PASSWORD ONE UPPER CASE
    @Test
    public void isOneUpperCaseValidPassword (){
        boolean result = validator.isOneUpperCaseValidPassword("Abhitanshu");
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID PASSWORD MINIMUM 8 CHARACTER
    @Test
    public void isOneUpperCaseInValidPassword() {
        boolean result = validator.isOneUpperCaseValidPassword("abhitanshu");
        Assert.assertFalse(result);
    }
}