package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PO_CheckOverviewPage extends PO_basePage
{

    @FindBy(xpath = "//div[@class='summary_total_label']")
    @CacheLookup
    WebElement totalPriceLinkTxtJacket;

    public void verifyProductsOnCart()
    {
        //1. Verify product 1
        String actualBacPackText = totalPriceLinkTxtJacket.getText();
        String expectedBackPackText = "Sauce Labs Backpack";

        Assert.assertEquals(actualBacPackText, expectedBackPackText, "Backpack text does not exist");
    }
    public PO_CheckOverviewPage(WebDriver rdriver)
    {
        super(rdriver);
    }
}
