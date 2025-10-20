package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_productPage extends PO_basePage
{

//    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
//    @CacheLookup
//    WebElement linkTextBackPack;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    @CacheLookup
    WebElement btnBackPackAddToCart;

//    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Bolt T-Shirt']")
//    @CacheLookup
//    WebElement linkTextTshirt;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    @CacheLookup
    WebElement btnTshirtAddToCart;

//    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Fleece Jacket']")
//    @CacheLookup
//    WebElement linkTextJacket;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    @CacheLookup
    WebElement btnJacketAddToCart;

//    @FindBy(xpath = "//button[@id='back-to-products']")
//    @CacheLookup
//    WebElement btnBackToProducts;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    @CacheLookup
    WebElement btnCart;

    public PO_productPage(WebDriver rdriver) {
        super(rdriver);
    }


    public void addProductsToCart() throws InterruptedException {
            //linkTextBackPack.click();
            Thread.sleep(1000);
            btnBackPackAddToCart.click();
            Thread.sleep(1000);
            //btnBackToProducts.click();
            Thread.sleep(1000);
           // linkTextTshirt.click();
            Thread.sleep(1000);
            btnTshirtAddToCart.click();
            Thread.sleep(1000);
            //btnBackToProducts.click();
            Thread.sleep(1000);
           // linkTextJacket.click();
            Thread.sleep(1000);
            btnJacketAddToCart.click();
            Thread.sleep(1000);

        }

    public void clickbtnCart()
    {
        btnCart.click();
    }


}
