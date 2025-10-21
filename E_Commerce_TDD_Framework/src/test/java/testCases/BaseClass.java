package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.ReadConfig;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    ReadConfig readconfig=new ReadConfig();
    public String baseURL=readconfig.getApplicationURL();
    public static WebDriver driver;

    @BeforeClass
    @Parameters({"browser"})
    public void setUp(String br)
    {

        switch(br.toLowerCase())
        {
            case "chrome" :
                driver=new ChromeDriver();
                break;
            case "edge" :
                driver=new EdgeDriver();
                break;
            case "firefox" :
                driver=new FirefoxDriver();
                break;
            default :
                System.out.println("Invalid browser name..");
                return;
        }

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(readconfig.getApplicationURL()); //Reading URL from config.properties
        driver.manage().window().maximize();

        driver.get(baseURL);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

    //Closes the browser
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
