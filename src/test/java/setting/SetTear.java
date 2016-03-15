package setting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by sasha on 15.03.16.
 */
public class SetTear {
    public WebDriver driver;


    @BeforeTest(alwaysRun = true)

    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://demo.nopcommerce.com/");
    }


    @AfterTest

    public void tearDown() throws  Exception{
        driver.quit();
    }
}
