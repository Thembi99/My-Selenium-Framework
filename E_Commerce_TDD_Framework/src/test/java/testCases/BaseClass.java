package testCases;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

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
