package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.Common;
import utilities.Driver;
import utilities.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    @BeforeMethod
    public void setup() {
        Driver.setDriver();
        Common.maximizeWindow();
    }

    @AfterMethod
    public void teardown() {
        Driver.closeDriver();
    }
}
