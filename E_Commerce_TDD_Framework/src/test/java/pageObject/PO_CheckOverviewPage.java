package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PO_CheckOverviewPage extends PO_basePage
{

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
    @CacheLookup
    WebElement totalPriceLinkTxtBackPack;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Bolt T-Shirt']")
    @CacheLookup
    WebElement totalPriceLinkTxtTshirt;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Fleece Jacket']")
    @CacheLookup
    WebElement totalPriceLinkTxtJacket;


    @FindBy(xpath = "//button[@id='checkout']")
    @CacheLookup
    WebElement btnOverviewCheckout;

    public void verifyProductsOnCart()
    {
        //1. Verify product 1
        String actualBacPackText = totalPriceLinkTxtBackPack.getText();
        String expectedBackPackText = "Backpack text does not exist";

        Assert.assertEquals(actualBacPackText, expectedBackPackText, "Item text does not match");


        //2. Verify product 2
        String actualTshirtText = totalPriceLinkTxtTshirt.getText();
        String expectedTshirtText = "Sauce Labs Bolt T-Shirt";

        Assert.assertEquals(actualTshirtText, expectedTshirtText, "Item text does not match");

        //3. Verify product 3
        String actualJacketText = totalPriceLinkTxtJacket.getText();
        String expectedJacketText = "Sauce Labs Fleece Jacket";

        Assert.assertEquals(actualJacketText, expectedJacketText, "Item text does not match");
    }

    public void ClickOverviewCheckout()
    {
        btnOverviewCheckout.click();
    }

    public PO_CheckOverviewPage(WebDriver rdriver)
    {
        super(rdriver);
    }
}
