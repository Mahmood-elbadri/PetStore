package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage extends BasePage {
    WebDriver driver;
    Actions actions;
    @FindBy(xpath = "//select[@name='cardType']")
    private WebElement cardType;
    @FindBy(xpath = "//input[@name='creditCard']")
    private WebElement cardNumber;

    @FindBy(xpath = "//input[@name='expiryDate']")
    private WebElement expiryDate;
    @FindBy(xpath = "//input[@name='billToFirstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='billToLastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@name='billAddress1']")
    private WebElement address;

    @FindBy(xpath = "//input[@name='billAddress2']")
    private WebElement addressTwo;

    @FindBy(xpath = "//input[@name='billCity']")
    private WebElement billCity;

    @FindBy(xpath = "//input[@name='billState']")
    private WebElement billState;

    @FindBy(xpath = "//input[@name='billZip']")
    private WebElement billZip;

    @FindBy(xpath = "//input[@name='billCountry']")
    private WebElement billCountry;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    private WebElement continueBtn;
    @FindBy(xpath = "//*[@id=\"CenterForm\"]/form/div/button[1]")
    private WebElement continueBtn1;

    public PaymentPage(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }

    public void chooseCardType() {
        Select select = new Select(cardType);

        // Select the item "Apple" from the combo box.
        select.selectByVisibleText("Visa");
        cardNumber.sendKeys("999999999999999");
        expiryDate.sendKeys("12/2019");

    }

    public void chooseBillingAddress() {
        firstName.clear();
        firstName.sendKeys("Walter");
        lastName.clear();
        lastName.sendKeys("White");
        address.clear();
        address.sendKeys("Albuquerque");
        addressTwo.clear();
        addressTwo.sendKeys("New Mexico");
        billCity.clear();
        billCity.sendKeys("Albuquerque");
        billState.clear();
        billState.sendKeys("New Mexico");
        billZip.clear();
        billZip.sendKeys("225");
        billCity.clear();
        billCity.sendKeys("USA");
        continueBtn.click();
        actions.contextClick(continueBtn).perform();
        continueBtn1.click();
        actions.contextClick(continueBtn1).perform();

    }


}
