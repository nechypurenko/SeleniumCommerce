package pageobject.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by sasha on 14.03.16.
 */
public class LoginPage {

    protected WebDriver driver;
    protected By userLoginLocator = By.id("Email");
    protected By userPasswLocator = By.xpath("[@id='Password']");
    protected By clickLoginBtnLocator = By.xpath("html/body/div[5]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void EnterLogin(String userLogin){
        WebElement usrLogTxt = driver.findElement(userLoginLocator);
                usrLogTxt.sendKeys(userLogin);
    }

    public void EnterPassw(String userPassw){
        WebElement usrPasswTxt = driver.findElement(userPasswLocator);
        usrPasswTxt.sendKeys(userPassw);
    }

    public void ClickLogin(){
        driver.findElement(clickLoginBtnLocator).click();
    }
}
