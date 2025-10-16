package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PO_cartPage extends PO_basePage
{


    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
    @CacheLookup
    WebElement cartLinkTxtBackPack;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Bolt T-Shirt']")
    @CacheLookup
    WebElement cartLinkTxtTshirt;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Fleece Jacket']")
    @CacheLookup
    WebElement cartLinkTxtJacket;

    @FindBy(xpath = "//button[@id='checkout']")
    @CacheLookup
    WebElement btnCheckout;


    public PO_cartPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void verifyProductsOnCart()
    {
        //1. Verify product 1
        String actualBacPackText = cartLinkTxtBackPack.getText();
        String expectedBackPackText = "Sauce Labs Backpack";

        Assert.assertEquals(actualBacPackText,expectedBackPackText,"Backpack text does not exist");

        //2. Verify Product 2
        String actualTshirtText = cartLinkTxtTshirt.getText();
        String expectedTshirtText = "Sauce Labs Bolt T-Shirt";

        Assert.assertEquals(actualTshirtText,expectedTshirtText,"Tshirt text does not exist");

        //3. Verefy Product 3
        String actualJacketText = cartLinkTxtJacket.getText();
        String expectedJacketText = "Sauce Labs Fleece Jacket";

        Assert.assertEquals(actualJacketText,expectedJacketText,"Jacket text does not exist");

    }

    public void clickBtnCheckout()
    {
        btnCheckout.click();
    }

}
