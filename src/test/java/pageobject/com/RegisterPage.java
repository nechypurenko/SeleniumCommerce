package pageobject.com;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage  {
    protected WebDriver driver;
    protected By firstNameTextBox = By.id("FirstName");
    protected By lastNameTextBox = By.id("LastName");
    protected By emailTextBox = By.id("Email");
    protected By passwTextBox = By.id("Password");
    protected By confirmPasswTextBox = By.id("ConfirmPassword");
    protected By registBtn = By.id("register-button");
    protected By userLogin = By.xpath("html/body/div[5]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");


    public RegisterPage(WebDriver driver) {
        this.driver = driver;

    }



    public void enterFirstName(String firstName ){
        WebElement firstNameTxtBox = driver.findElement(firstNameTextBox);
        firstNameTxtBox.click();
        firstNameTxtBox.clear();
        if (firstNameTxtBox.isDisplayed())
            firstNameTxtBox.sendKeys(firstName);
    }

    public void enterLastName(String lastName ){
        WebElement lastNameTxtBox = driver.findElement(lastNameTextBox);
        if (lastNameTxtBox.isDisplayed())
            lastNameTxtBox.sendKeys(lastName);
    }

    public void enterEmail(String email ){
        WebElement emailTxtBox = driver.findElement(emailTextBox);
        if (emailTxtBox.isDisplayed())
            emailTxtBox.sendKeys(email);
    }

    public void enterPassword(String passw ){
        WebElement passwTxtBox = driver.findElement(passwTextBox);
        if (passwTxtBox.isDisplayed())
            passwTxtBox.sendKeys(passw);
    }

    public void enterConfirmPass(String confirmPass ){
        WebElement emailTxtBox = driver.findElement(confirmPasswTextBox);
        if (emailTxtBox.isDisplayed())
            emailTxtBox.sendKeys(confirmPass);
    }


    public void clickRegistBtn(){
        driver.findElement(registBtn).click();

    }

    public void assertNameLogin(){
        Assert.assertEquals("User Login", driver.findElement(userLogin).getText(),"firs@mailinator.com");

    }

    public void register(String firstName, String lastName, String email , String passw, String confirmPass){
        enterFirstName(firstName);
        enterLastName(lastName);
        enterEmail(email);
        enterPassword(passw);
        enterConfirmPass(confirmPass);
        clickRegistBtn();

    }



}
