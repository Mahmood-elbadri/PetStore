package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends BasePage {
    Actions actions;
    @FindBy(xpath = "//*[@id=\"CenterForm\"]/form/div/button[1]")
    private WebElement confirmBtn;
    @FindBy(xpath = "//*[@id=\"BackLink\"]/a")
    private WebElement backToMenu;

    public ConfirmationPage(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }


    public void clickBack() throws InterruptedException {
        confirmBtn.click();
        actions.contextClick(backToMenu).perform();
        Thread.sleep(2000);
        backToMenu.click();
    }
}
