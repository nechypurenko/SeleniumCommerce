package pageobject.com;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    protected WebDriver driver;
    private By registerLink = By.xpath("html/body/div[5]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    protected By loginLinkLocator = By.xpath("html/body/div[5]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");



    public MainPage(WebDriver driver) {
        this.driver = driver;

    }

   public RegisterPage clickRegisterLink(){
       WebElement registerLinkElement = driver.findElement(registerLink);
       if (registerLinkElement.isDisplayed()|| registerLinkElement.isEnabled())
           registerLinkElement.click();
       else System.out.println("Element not fpund");
       return new RegisterPage(driver);
   }

    public LoginPage clickLoginrLink(){
        WebElement loginLinkElement = driver.findElement(loginLinkLocator);
        if (loginLinkElement.isDisplayed()|| loginLinkElement.isEnabled())
            loginLinkElement.click();
        else System.out.println("Element not fpund");
       return new LoginPage(driver);
    }



}



