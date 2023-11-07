package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DogsPage extends BasePage {
    WebDriver driver;
    @FindBy(xpath = "//a[normalize-space()='K9-DL-01']")
    private WebElement dalmationDog;

    public DogsPage(WebDriver driver) {
        super(driver);
    }

    public void chooseDamlation() {
        dalmationDog.click();
    }
}
