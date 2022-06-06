package tests.ikea;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class DeleteItemFromTheCart extends BaseTest {

    @Test
    public static void deleteItem() {

        String searchWords = "KLAPPA kamuolys";
        String expectedMessage = "Jūsų pirkinių krepšelis tuščias. Jūs neturite prekių pirkinių krepšelyje.";

        pages.ikea.DeleteItemFromCart.open();
        pages.ikea.DeleteItemFromCart.closeCookies();
        pages.ikea.DeleteItemFromCart.enterToTheSearchBox(searchWords);
        pages.ikea.DeleteItemFromCart.clickToFindButton();
        pages.ikea.DeleteItemFromCart.clickItem();
        pages.ikea.DeleteItemFromCart.clickAddToTheCart();
        pages.ikea.DeleteItemFromCart.clickCheckItemsInTheCart();
        pages.ikea.DeleteItemFromCart.clickDeleteItem();
        String actualMessage = pages.ikea.DeleteItemFromCart.getDeletedItemText();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
