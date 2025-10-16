package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_cartPage extends PO_basePage
{

//I want to veryfy the products in this cart???????????
    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[2]/button[2]")
    @CacheLookup
    WebElement btnCheckout;

    public PO_cartPage(WebDriver rdriver) {
        super(rdriver);
    }

    public void setBtnCheckout()
    {
        btnCheckout.click();
    }

}
