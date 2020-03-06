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
    public void isOneUpperCaseValid(){
        boolean result = validator.isOneUpperCaseValidPassword("Abhitanshu");
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID PASSWORD MINIMUM 8 CHARACTER
    @Test
    public void isOneUpperCaseInValid() {
        boolean result = validator.isOneUpperCaseValidPassword("abhitanshu");
        Assert.assertFalse(result);
    }
    //TEST CASE FOR VALID PASSWORD ONE NUMERIC
    @Test
    public void isOneNumericValid(){
        boolean result = validator.isOneNumericValidPassword("Abhitanshu99");
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID PASSWORD ONE NUMERIC
    @Test
    public void isOneNumericInValid() {
        boolean result = validator.isOneNumericValidPassword("Abhitanshu");
        Assert.assertFalse(result);
    }
    //TEST CASE FOR VALID PASSWORD EXACTLY ONE SPECIAL CHARACTER
    @Test
    public void isSpecialCharacterValid(){
        boolean result = validator.isSpecialValidPassword("Abhitanshu99@");
        Assert.assertTrue(result);
    }

    //TEST CASE FOR INVALID PASSWORD EXACTLY ONE SPECIAL CHARACTER
    @Test
    public void isSpecialCharacterInValid() {
        boolean result = validator.isSpecialValidPassword("Abhitanshu99@@");
        Assert.assertFalse(result);
    }
    //TEST CASE FOR ALL VALID EMAIL
    @Test
    public void isAllEmailValid(){
        String[] validEmailArray= {"abc@yahoo.com" ,"abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com"};
        for (int index=0; index<validEmailArray.length; index++) {
            boolean result = validator.isValidEmail(validEmailArray[index]);
            Assert.assertTrue(result);
        }
    }
    //TEST CASE FOR ALL INVALID EMAIL
    @Test
    public void isAllEmailInValid(){
        String[] InvalidEmailArray= {"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com ","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};
        for (int index=0; index<InvalidEmailArray.length; index++) {
            boolean result = validator.isValidEmail(InvalidEmailArray[index]);
            Assert.assertFalse(result);
        }
    }
}