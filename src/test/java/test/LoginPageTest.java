package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.com.LoginPage;
import pageobject.com.MainPage;
import pageobject.com.RegisterPage;
import setting.SetTear;

import java.util.concurrent.TimeUnit;

/**
 * Created by sasha on 14.03.16.
 */
public class LoginPageTest extends SetTear {

    @Test

    public void Login(){
        MainPage mainPage = new MainPage(driver);
        LoginPage logPage = new LoginPage(driver);
        mainPage.clickLoginrLink();
        logPage.EnterLogin("firs@mailinator.com");
        logPage.EnterLogin("1234qwer");

    }





}
