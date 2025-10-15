package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReadConfig;

public class BaseClass {

    ReadConfig readConfig=new ReadConfig();
    public static WebDriver driver;
    public void setUp(String browser)
    {
        if (browser.equals("chrome"))
        {
            //BaseClass
            System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());
            driver=new ChromeDriver();

        }
    }
}
