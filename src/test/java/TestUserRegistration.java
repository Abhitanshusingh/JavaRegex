import org.junit.Assert;
import org.junit.Test;
public class TestUserRegistration {
    UserRegistration validator =new UserRegistration();
    //TEST CASE FOR VALID FIRST NAME
    @Test
    public void firstNameValid() {
        boolean result=validator.isValidFirstName("Abhi");
        Assert.assertTrue(result);
    }
    //TEST CASE FOR INVALID VALID FIRST NAME
    @Test
    public void firstNameInvalid() {
        boolean result=validator.isValidFirstName("abhi");
        Assert.assertFalse(result);
    }
    //TEST CASE FOR VALID LAST NAME
    @Test
    public void lastNameValid() {
        boolean result=validator.isValidFirstName("Singh");
        Assert.assertTrue(result);
    }
    //TEST CASE FOR INVALID VALID LAST NAME
    @Test
    public void lastNameInvalid() {
        boolean result=validator.isValidFirstName("sInGh");
        Assert.assertFalse(result);
    }
}
