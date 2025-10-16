package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_productPage extends PO_basePage
{

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")
    @CacheLookup
    WebElement linkTextBackPack;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")
    @CacheLookup
    WebElement btnBackPackAddToCart;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[1]/a/div")
    @CacheLookup
    WebElement linkTextTshirt;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div[2]/button")
    @CacheLookup
    WebElement btnTshirtAddToCart;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[4]/div[2]/div[1]/a/div")
    @CacheLookup
    WebElement linkTextJacket;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div[2]/button")
    @CacheLookup
    WebElement btnJacketAddToCart;

    public PO_productPage(WebDriver rdriver) {
        super(rdriver);
    }


    public void addProductsToCart()
        {
            linkTextBackPack.click();
            btnBackPackAddToCart.click();
            linkTextTshirt.click();
            btnTshirtAddToCart.click();
            linkTextJacket.click();
            btnJacketAddToCart.click();

        }


}
