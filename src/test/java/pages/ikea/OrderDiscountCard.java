package pages.ikea;

import org.openqa.selenium.By;
import pages.Common;
import tests.BaseTest;

public class OrderDiscountCard extends BaseTest {

    public static void open() {
        Common.openURL("https://www.ikea.lt/lt/client/quickfamily");
    }

    public static void closeCookies() {
        By locator = By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonAccept']");
        Common.clickElement(locator);
    }

    public static void enterEmail(String email) {
        By locator = By.xpath("//*[@id='email']");
        Common.sendKeysToElement(locator, email);
    }

    public static void clickDownloadCardButton() {
        By locator = By.xpath("//*[@id='createEmailKiosk_submit']");
        Common.clickElement(locator);
    }

    public static String getConfirmText() {
        By locator = By.xpath("(//*[@class='col-12 py-3'])[2]");
        Common.waitForElement(locator);
        return Common.getElementText(locator);
    }
}
