package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.com.CreateRegisterPage;
import pageobject.com.MainPage;
import pageobject.com.RegisterPage;
import setting.SetTear;

import java.util.concurrent.TimeUnit;

/**
 * Created by sasha on 14.03.16.
 */
public class RegisterPageTest extends SetTear{


    @Test

    public void testRegister() throws Exception {
        MainPage mainPage = new MainPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        CreateRegisterPage createRegisterPage = new CreateRegisterPage(driver);
        mainPage.clickRegisterLink();
        registerPage.register("sasha", "saha", "firs@mailinator.com", "1234qwer", "1234qwer" );
        createRegisterPage.assertSucces();
        createRegisterPage.cliclContinueBtn();
        registerPage.assertNameLogin();

    }


}
