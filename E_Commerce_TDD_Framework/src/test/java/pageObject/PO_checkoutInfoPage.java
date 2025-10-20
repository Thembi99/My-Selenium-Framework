package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PO_checkoutInfoPage extends PO_basePage
{

    @FindBy(xpath = "//input[@id='first-name']")
    @CacheLookup
    WebElement txtFirstName;

    @FindBy(xpath = "//input[@id='last-name']")
    @CacheLookup
    WebElement txtLAstName;

    @FindBy(xpath = "//input[@id='postal-code']")
    @CacheLookup
    WebElement txtZipCOde;

    @FindBy(xpath = "//input[@id='continue']")
    @CacheLookup
    WebElement btnContinue;

    @FindBy(xpath = "//button[@id='finish']")
    @CacheLookup
    WebElement btnFinish;

    @FindBy(xpath = "//h2[normalize-space()='Thank you for your order!']")
    @CacheLookup
    WebElement orderCompleteVerification;


    public void confirmUserDetails(String firstname, String lastname, String zcode){
        txtFirstName.sendKeys(firstname);
        txtLAstName.sendKeys(lastname);
        txtZipCOde.sendKeys(zcode);

    }

    public void clickContinue() {
        btnContinue.click();
    }


    public void clickFinish() {
        btnFinish.click();
    }

    public void verifyOrderCompleteness() {
        //1. Verify product 1
        String actualCompleteText = orderCompleteVerification.getText();
        String expectedCompleteText = "Thank you for your order!";

        Assert.assertEquals(actualCompleteText, expectedCompleteText, "Order is not complete");

    }
    public PO_checkoutInfoPage(WebDriver rdriver) {
        super(rdriver);
    }
}
