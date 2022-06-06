package pages.ikea;

import org.openqa.selenium.By;
import pages.Common;

public class StockInformation {

    public static void open() {
        Common.openURL("https://www.ikea.lt/lt/products/valgomasis/valgomojo-stalai/stalai");
    }

    public static void closeCookies() {
        By locator = By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonAccept']");
        Common.clickElement(locator);
    }

    public static void clickOnTheItem() {
        By locator = By.xpath("//*[@id=\"contentWrapper\"]/div/div/div[2]/div[1]/div/div[2]/div/a");
        Common.clickElement(locator);
    }

    public static void clickStockButton() {
        By locator = By.xpath("//*[@class='pup-stock pup-stock_js']");
        Common.clickElement(locator);
    }

    public static String getStockInfoText() {
        By locator = By.xpath("//*[@class='display-7']");
        return Common.getElementText(locator);
    }
}