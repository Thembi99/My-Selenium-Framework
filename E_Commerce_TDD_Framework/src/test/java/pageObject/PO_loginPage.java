package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testCases.BaseClass;

public class PO_loginPage
{
    WebDriver ldriver;

    public PO_loginPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")
    @CacheLookup
    WebElement txtUserName;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div/div/form/input")
    @CacheLookup
    WebElement btnLogin;


    public void setUserName(String uname) {
        txtUserName.sendKeys(uname);
    }

    public void setPassword(String password) {
        txtUserName.sendKeys(password);
    }

    public void clickLogin() {
        btnLogin.click();
    }


}
