package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.MarketPageNavigation;

public class MarketPageNavigationSteps {


    private static final Logger LOGGER = LogManager.getLogger(StartPageNavigationSteps.class);
    WebDriver driver = Hooks.driver;


    @When("User Click On Market Option")
    public void ClickOnMarketButton() {
        new MarketPageNavigation(driver).ClickOnMarketButton();
    }

    @And("User Clicks On Market your Business")
    public void ClickOnMarketYourBusiness() {
        new MarketPageNavigation(driver).ClickOnMarketYourBusiness();
    }


    @And("User Click On Audience Button")
    public void ClickOnAudience() {
        new MarketPageNavigation(driver).ClickOnAudience();
    }


    @Then("User Can See Audience Targeting Title in This Page")
    public void  ValidateAudienceTargeting() {
        new MarketPageNavigation(driver).ValidateAudienceTargeting();
    }
}
