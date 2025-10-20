package testCases;

import org.testng.annotations.Test;
import pageObject.PO_loginPage;

import java.time.Duration;

public class TCLoginPage extends BaseClass
{
    @Test
    public void login_page()
    {
        PO_loginPage pl = new PO_loginPage(driver);
        pl.setUserName(readconfig.getUsername());
        pl.setPassword(readconfig.getPassword());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        pl.clickLogin();


    }
}
