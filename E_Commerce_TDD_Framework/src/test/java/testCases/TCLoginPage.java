package testCases;

import org.testng.annotations.Test;
import pageObject.PO_CheckOverviewPage;
import pageObject.PO_loginPage;
import pageObject.PO_productPage;

import java.time.Duration;

public class TCLoginPage extends BaseClass
{



    @Test
    public void login_page() throws InterruptedException {

        //Initializing POs
        PO_loginPage pl = new PO_loginPage(driver);
        PO_productPage pro = new PO_productPage(driver);
        PO_CheckOverviewPage poCheckOverviewPage = new PO_CheckOverviewPage(driver);

        //Username and password
        pl.setUserName(readconfig.getUsername());
        pl.setPassword(readconfig.getPassword());

        Thread.sleep(2000);

        pl.clickLogin();

        Thread.sleep(5000);
       //Adding products to cart
        pro.addProductsToCart();
        Thread.sleep(2000);

        pro.clickbtnCart();

        //Verify text
        poCheckOverviewPage.verifyProductsOnCart();

        Thread.sleep(2000);



    }
}
