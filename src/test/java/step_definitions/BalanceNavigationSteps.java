package step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.BalanceNavigation;


public class BalanceNavigationSteps {


    private static final Logger LOGGER = LogManager.getLogger(BalanceNavigationSteps.class);
    WebDriver driver = Hooks.driver;


    @When("User Click On Manage Button")
    public void ClickManageButton() {
        new BalanceNavigation(driver).ClickManageButton();
    }


    @And("User Click On Balance Button")
    public void ClickBalanceButton() {
        new BalanceNavigation(driver).ClickBalanceButton();
    }


    @And("User Click On Rewards Button")
    public void ClickRewardsButton() {
        new BalanceNavigation(driver).ClickRewardsButton();
    }


    @Then("Users can see Shopify Balance Rewards Title On This Page")
    public void  ValidateShopifyBalanceRewards() {
        new BalanceNavigation(driver).ValidateShopifyBalanceRewards();
    }
}
