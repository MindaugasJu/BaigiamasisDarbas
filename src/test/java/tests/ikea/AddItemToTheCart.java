package tests.ikea;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class AddItemToTheCart extends BaseTest {

    @Test
    public static void testAddItemToCart() {

        String searchWords = "KLAPPA kamuolys";
        String expectedMessage = "Minkštasis žaislas, kamuolys";

        pages.ikea.AddItemToTheCart.open();
        pages.ikea.AddItemToTheCart.closeCookies();
        pages.ikea.AddItemToTheCart.enterToTheSearchBox(searchWords);
        pages.ikea.AddItemToTheCart.clickToFindButton();
        pages.ikea.AddItemToTheCart.clickItem();
        pages.ikea.AddItemToTheCart.clickAddToTheCart();
        String textWhenItemAdded = pages.ikea.AddItemToTheCart.getTextIfItemAdded();

        Assert.assertEquals(textWhenItemAdded, expectedMessage);
    }
}


