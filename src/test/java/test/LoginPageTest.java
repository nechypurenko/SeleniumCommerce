package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.com.LoginPage;
import pageobject.com.MainPage;
import pageobject.com.RegisterPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by sasha on 14.03.16.
 */
public class LoginPageTest {

    private WebDriver driver;
    private MainPage mainPage;
    private LoginPage loginPage;


    @BeforeTest

    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://demo.nopcommerce.com/");
    }
    @Test




    @AfterTest

    public void tearDown() throws  Exception{
        driver.quit();
    }
}
