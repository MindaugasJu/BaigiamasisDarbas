package tests.ikea;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class OrderDiscountCard extends BaseTest {


    @Test
    public void testIfOrderDiscountCard() {

        String email = "hp900@inbox.lt";
        String expectedMessage = "Patvirtinkite savo el. pašto adresą";

        pages.ikea.OrderDiscountCard.open();
        pages.ikea.OrderDiscountCard.closeCookies();
        pages.ikea.OrderDiscountCard.enterEmail(email);
        pages.ikea.OrderDiscountCard.clickDownloadCardButton();
        String actualText = pages.ikea.OrderDiscountCard.getConfirmText();

        Assert.assertEquals(actualText, expectedMessage);
    }
}
