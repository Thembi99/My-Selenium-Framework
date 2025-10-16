package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PO_checkoutInfoPage extends PO_basePage
{

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/form/div[1]/div[1]/input")
    @CacheLookup
    WebElement txtFirstName;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/form/div[1]/div[2]/input")
    @CacheLookup
    WebElement txtLAstName;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/form/div[1]/div[3]/input")
    @CacheLookup
    WebElement txtZipCOde;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/form/div[2]/input")
    @CacheLookup
    WebElement btnContinue;


    public PO_checkoutInfoPage(WebDriver rdriver) {
        super(rdriver);
    }
}
