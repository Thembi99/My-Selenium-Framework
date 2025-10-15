package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utilities.ReadConfig;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    ReadConfig readconfig=new ReadConfig();
    public String baseURL=readconfig.getApplicationURL();
    public static WebDriver driver;
    public void setUp(String browser)
    {
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
            driver = new ChromeDriver();

        } else if (browser.equals("fireFox")) {
            System.setProperty("webdriver.gecko.driver", readconfig.getGeckoPath());
            driver = new FirefoxDriver();

        } else if (browser.equals("ie")) {
            System.setProperty("webdriver.ie.driver", readconfig.getMsEdgePath());
            driver = new InternetExplorerDriver();
        }


        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    public void tearDown()
    {
        driver.quit();
    }
}
