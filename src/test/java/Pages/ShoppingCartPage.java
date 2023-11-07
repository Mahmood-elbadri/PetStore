package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{
    WebDriver driver;
    @FindBy(xpath = "//input[@name='EST-9']")
    private WebElement quantityBox;
    @FindBy(xpath = "//button[normalize-space()='Update Cart']")
    private WebElement updateCartBtn;
    @FindBy(xpath = "//a[normalize-space()='Proceed to Checkout']")
    private WebElement proceedBtn;
    public ShoppingCartPage(WebDriver driver){
        super(driver);
    }
    public void setQuantity(){
        quantityBox.clear();
        quantityBox.sendKeys("50");
    }
    public void clickUpdateCart(){
        updateCartBtn.click();
    }
    public void clickProceed(){
        proceedBtn.click();
    }
}
