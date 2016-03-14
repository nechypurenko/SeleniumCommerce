package pageobject.com;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    private WebDriver driver;
    private By firstNameTextBox = By.id("FirstName");
    private By lastNameTextBox = By.id("LastName");
    private By emailTextBox = By.id("Email");
    private By passwTextBox = By.id("Password");
    private By confirmPasswTextBox = By.id("ConfirmPassword");
    private By registBtn = By.id("register-button");


    public RegisterPage(WebDriver driver) {
        this.driver = driver;

    }

    public void enterFirstName(String firstName ){
        WebElement firstNameTxtBox = driver.findElement(firstNameTextBox);
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


    public void clickRegistBtn(String registButton){
        WebElement regBtn = driver.findElement(registBtn);
        if (regBtn.isDisplayed())
            regBtn.click();
    }



}
