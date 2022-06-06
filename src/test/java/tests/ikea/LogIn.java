package tests.ikea;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class LogIn extends BaseTest {
    @Test
    public void testLogInIkea() {

        String email = "hp900@inbox.lt";
        String password = "123456789";
        String expectedInfo = "Atsijungti";

        pages.ikea.LogIn.open();
        pages.ikea.LogIn.closeCookies();
        pages.ikea.LogIn.enterEmail(email);
        pages.ikea.LogIn.enterPassword(password);
        pages.ikea.LogIn.clickLogInButton();
        String getLogOutButtonText = pages.ikea.LogIn.getLogOutText();

        Assert.assertEquals(getLogOutButtonText, expectedInfo);
    }
}