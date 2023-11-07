package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    WebDriver driver;
    public HomePage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "(//a[normalize-space()='Dogs'])[2]")private WebElement dogBtn;
    public void clickDog(){
        dogBtn.click();
    }
}
