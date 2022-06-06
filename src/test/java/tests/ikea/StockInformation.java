package tests.ikea;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class StockInformation extends BaseTest {

    @Test
    public void testItemStockInformation() {

        String expectedMessage = "Likutis IKEA Vilnius";

        pages.ikea.StockInformation.open();
        pages.ikea.StockInformation.closeCookies();
        pages.ikea.StockInformation.clickOnTheItem();
        pages.ikea.StockInformation.clickStockButton();
        String actualMessage = pages.ikea.StockInformation.getStockInfoText();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
