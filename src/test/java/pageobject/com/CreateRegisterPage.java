package pageobject.com;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateRegisterPage {

    private  WebDriver driver;

    public By resComplatedLocator = By.xpath("html/body/div[5]/div[3]/div/div/div/div[2]/div[1]");
    protected By clickContinueLocatir = By.xpath("html/body/div[5]/div[3]/div/div/div/div[2]/div[2]/input");

    public CreateRegisterPage(WebDriver driver) {
        this.driver = driver;


    }

    public void assertSucces(){
        Assert.assertEquals("Your registration completed", driver.findElement(resComplatedLocator).getText(), "Your registration completed");
    }

    public void cliclContinueBtn(){
        driver.findElement(clickContinueLocatir).click();
    }




}
