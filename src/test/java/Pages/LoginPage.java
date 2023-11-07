package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    WebDriver driver;

    @FindBy(xpath = "//*[text()='Sign In']")
    private WebElement signInBtn;
    @FindBy(name = "username")
    private WebElement nameBox;
    @FindBy(name = "password")
    private WebElement passwordBox;
    @FindBy(xpath = "//*[text()='Login']")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void clickSignIn(){
        signInBtn.click();
    }

    public void enterUserName(String userName){
        nameBox.clear();
        nameBox.sendKeys(userName);
    }
    public void enterPass(String pass){
        passwordBox.clear();
        passwordBox.sendKeys(pass);
    }
    public void clickLogin(){
        loginBtn.click();
    }
}
