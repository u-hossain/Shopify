package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.LearnPageNavigation;

public class LearnPageNavigationSteps {

    private static final Logger LOGGER = LogManager.getLogger(LearnPageNavigationSteps.class);
    WebDriver driver = Hooks.driver;

    @When("User Click On Learn Option")
    public void ClickOnLearnButton() {
        new LearnPageNavigation(driver).ClickOnLearnButton();
    }

    @And("User Clicks On Help Center")
    public void ClickOnHelpCenter() {
        new LearnPageNavigation(driver).ClickOnHelpCenter();
    }


    @And("User Click On Intro To Shopify Button")
    public void ClickOnIntroToShopify() {
        new LearnPageNavigation(driver).ClickOnIntroToShopify();
    }


    @Then("User Can See Intro To Shopify Title in This Page")
    public void  ValidateIntroToShopify() {
        new LearnPageNavigation(driver).ValidateIntroToShopify();
    }
}
