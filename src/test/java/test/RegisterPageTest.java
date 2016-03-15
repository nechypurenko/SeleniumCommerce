package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.com.MainPage;
import pageobject.com.RegisterPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by sasha on 14.03.16.
 */
public class RegisterPageTest {

    private WebDriver driver;




    @BeforeTest(alwaysRun = true)

    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://demo.nopcommerce.com/");
    }
    @Test

    public void testRegister() throws Exception {
        MainPage mainPage = new MainPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        mainPage.clickRegisterLink();
        registerPage.register("sasha", "saha", "firsttest@mailinator.com", "1234qwer", "1234qwer" );

    }

    @AfterTest

    public void tearDown() throws  Exception{
        driver.quit();
    }
}
