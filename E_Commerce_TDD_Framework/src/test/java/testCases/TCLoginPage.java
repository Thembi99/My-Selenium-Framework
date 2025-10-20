package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pageObject.*;

import java.time.Duration;

public class TCLoginPage extends BaseClass
{



    @Test
    public void login_page() throws InterruptedException {

        //Initializing POs
        PO_loginPage pl = new PO_loginPage(driver);
        PO_productPage pro = new PO_productPage(driver);
        PO_CheckOverviewPage poCheckOverviewPage = new PO_CheckOverviewPage(driver);
        PO_checkoutInfoPage checkoutInfo = new PO_checkoutInfoPage(driver);

        //Username and password
        pl.setUserName(readconfig.getUsername());
        pl.setPassword(readconfig.getPassword());

        Thread.sleep(1000);

        pl.clickLogin();

        Thread.sleep(2000);
       //Adding products to cart
        pro.addProductsToCart();
        Thread.sleep(1000);

        pro.clickbtnCart();

        //Verify text and checkout
        poCheckOverviewPage.verifyProductsOnCart();
        Thread.sleep(1000);

        //Scroll down to see the checkout button
        // Cast driver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by a specific pixel value (e.g., 1000 pixels)
        js.executeScript("window.scrollBy(0, 500);");
        Thread.sleep(1000);

        poCheckOverviewPage.ClickOverviewCheckout();
        Thread.sleep(1000);

        //Verify check customer info
        checkoutInfo.confirmUserDetails(readconfig.getFirstname(), readconfig.getlastname(), readconfig.getzipcode());

        Thread.sleep(1000);

        checkoutInfo.clickContinue();

        Thread.sleep(1000);

        checkoutInfo.clickFinish();






    }
}
