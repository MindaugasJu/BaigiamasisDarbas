package pages.ikea;

import org.openqa.selenium.By;
import pages.Common;

public class DeleteItemFromCart {

    public static void open() {
        Common.openURL("https://www.ikea.lt/");
    }

    public static void closeCookies() {
        By locator = By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonAccept']");
        Common.clickElement(locator);
    }

    public static void enterToTheSearchBox(String searchWords) {
        By locator = By.xpath("//*[@id='header_searcher_desktop_input']");
        Common.sendKeysToElement(locator, searchWords);
    }

    public static void clickToFindButton() {
        By locator = By.xpath("//*[@class='btn searchIcon']");
        Common.clickElement(locator);
    }

    public static void clickItem() {
        By locator = By.xpath("//*[@class='card-img-top']");
        Common.clickElement(locator);
    }

    public static void clickAddToTheCart() {
        By locator = By.xpath("//*[@class='icon-addcart']");
        Common.clickElement(locator);
    }

    public static void clickCheckItemsInTheCart() {
        By locator = By.xpath("//*[@class='goToCart btn btn-yellow  btn-icon text-white']");
        Common.clickElement(locator);
    }

    public static void clickDeleteItem() {
        By locator = By.xpath("//*[@class='remove d-none d-md-block order-4']");
        Common.clickElement(locator);
    }

    public static String getDeletedItemText() {
        By locator = By.xpath("//*[@class='m-3']");
        return Common.getElementText(locator);
    }
}