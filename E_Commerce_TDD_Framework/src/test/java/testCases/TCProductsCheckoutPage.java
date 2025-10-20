package testCases;

import org.testng.annotations.Test;
import pageObject.PO_loginPage;
import pageObject.PO_productPage;

import java.time.Duration;

public class TCProductsCheckoutPage extends BaseClass{

    @Test
    public void products_page()
    {
        PO_productPage pro = new PO_productPage(driver);
        pro.addProductsToCart();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        pro.clickbtnCart();


    }
}
