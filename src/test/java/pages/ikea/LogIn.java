package pages.ikea;

import org.openqa.selenium.By;
import pages.Common;

public class LogIn {

    public static void open() {
        Common.openURL("https://www.ikea.lt/lt/client");
    }

    public static void closeCookies() {
        By locator = By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonAccept']");
        Common.clickElement(locator);
    }

    public static void enterEmail(String email) {
        By locator = By.xpath("//*[@id='loginForm_email']");
        Common.sendKeysToElement(locator, email);
    }

    public static void enterPassword(String password) {
        By locator = By.xpath("//*[@id='loginForm_password']");
        Common.sendKeysToElement(locator, password);
    }

    public static void clickLogInButton() {
        By locator = By.xpath("//*[@id=\"btnSubmitLogin\"]");
        Common.clickElement(locator);
    }

    public static String getLogOutText() {
        By locator = By.xpath("(//*[@class='nav-item nav-link pr-0'])[2]/a");
        Common.waitForElement(locator);
        return Common.getElementText(locator);
    }
}