package StepDefs;

import Pages.*;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import DataProvider.CredentialsProvider;

public class StepDefinitions {
    static WebDriver driver;
    static AddToCartPage cart;
    static DogsPage dogs;
    static HomePage home;
    static LoginPage login;
    static PaymentPage pay;
    static ShoppingCartPage shopping;
    static ConfirmationPage confirm;
    @BeforeAll
    public static void beforeAll() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        cart = new AddToCartPage(driver);
        dogs = new DogsPage(driver);
        home = new HomePage(driver);
        login = new LoginPage(driver);
        pay = new PaymentPage(driver);
        shopping = new ShoppingCartPage(driver);
        confirm = new ConfirmationPage(driver);
        driver.manage().window().maximize();
    }
    @Given("user is navigated to the website")
    public void user_is_navigated_to_the_website() {
        driver.get("https://jpetstore.aspectran.com/");
        login.clickSignIn();
    }
    //@Test(dataProvider="credentials",dataProviderClass = CredentialsProvider.class)
    @And("^enter (.*) and (.*) and click login$")
    public void enter_username_and_password_and_click_login(String username,String pass) throws InterruptedException {
         login.enterUserName(username);
         login.enterPass(pass);
         Thread.sleep(2000);
         login.clickLogin();
    }
    @Given("select the dogs from the pane")
    public void select_the_dogs_from_the_pane() {
        home.clickDog();
    }
    @And("choose the appropriate dog")
    public void choose_the_appropriate_dog() {
        dogs.chooseDamlation();
    }
    @Then("select the item with the appropriate price")
    public void select_the_item_with_the_appropriate_price() {
        cart.addMalePuppyToCart();
    }
    @And("add the dog to the cart")
    public void add_the_dog_to_the_cart() {
        shopping.setQuantity();
    }
    @When("updating the quantity and click update cart")
    public void updating_the_quantity_and_click_update_cart() {
        shopping.clickUpdateCart();
    }
    @Then("click proceed out")
    public void click_proceed_out() {
        shopping.clickProceed();
    }
    @And("add the payment details")
    public void add_the_payment_details() {
        pay.chooseCardType();
        pay.chooseBillingAddress();
    }
    @Then("confirm the details")
    public void confirm_the_details() throws InterruptedException {
        confirm.clickBack();
    }


}
