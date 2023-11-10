package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage{
    @FindBy(xpath = "(//a[@class='button'][normalize-space()='Add to Cart'])[1]")
    private WebElement malePuppy;
    public AddToCartPage(WebDriver driver){
        super(driver);
    }
    public void addMalePuppyToCart(){
        malePuppy.click();
    }
}
