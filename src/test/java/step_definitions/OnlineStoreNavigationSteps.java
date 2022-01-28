package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.OnlineStoreNavigation;

public class OnlineStoreNavigationSteps {


    private static final Logger LOGGER = LogManager.getLogger(OnlineStoreNavigationSteps.class);
    WebDriver driver = Hooks.driver;


    @When("User Click On Sell Button")
    public void ClickSellButton() {
        new OnlineStoreNavigation(driver).ClickSellButton();
    }


    @And("User Click On Online Store Button")
    public void ClickOnlineStore() {
        new OnlineStoreNavigation(driver).ClickOnLineStore();
    }


    @And("User Click On OverView Button")
    public void ClickOnOverView() {
        new OnlineStoreNavigation(driver).ClickOnOverView();
    }


    @Then("Users can see Shopify Online Store Title On This Page")
    public void  ValidateShopifyOnlineStore() {
        new OnlineStoreNavigation(driver).ValidateShopifyOnlineStore();
    }
}
