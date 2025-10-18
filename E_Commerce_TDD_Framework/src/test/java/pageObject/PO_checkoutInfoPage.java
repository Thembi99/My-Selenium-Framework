package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

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


    public PO_checkoutInfoPage(WebDriver rdriver) {
        super(rdriver);
    }
}
