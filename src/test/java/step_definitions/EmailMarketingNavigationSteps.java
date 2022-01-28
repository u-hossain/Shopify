package step_definitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.EmailMarketingNavigation;

public class EmailMarketingNavigationSteps {


    private static final Logger LOGGER = LogManager.getLogger(EmailMarketingNavigationSteps.class);
    WebDriver driver = Hooks.driver;

    @When("User Click On Market Button")
    public void ClickMarketButton() {
        new EmailMarketingNavigation(driver).ClickMarketButton();
    }


    @And("User Click On Email Marketing Button")
    public void ClickEmailMarketing() {
        new EmailMarketingNavigation(driver).ClickOnEmailMarketing();
    }


    @And("User Click On Log In To Create Campaign Button")
    public void ClickOnLogInToCreateCampaign() {
        new EmailMarketingNavigation(driver).ClickOnLogInToCreateCampaign();
    }


    @Then("Users can see Log In Continue To Shopify Title On This Page")
    public void  ValidateLogInContinueToShopify() {
        new EmailMarketingNavigation(driver).ValidateLogInContinueToShopify();
    }
}
