package testCases;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public void setUp(String browser)
    {
        if (browser.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());
            driver=new ChromeDriver();

        }
    }
}
