package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.BrandingNavigation;

public class BrandingNavigationSteps {


    private static final Logger LOGGER = LogManager.getLogger(BrandingNavigationSteps.class);
    WebDriver driver = Hooks.driver;

    @When("User Click On Start Button")
    public void ClickStartButton() {
        new BrandingNavigation(driver).ClickStartButton();
    }

    @And("User Click On Branding Button")
    public void ClickBranding() {
        new BrandingNavigation(driver).ClickOnBranding();
    }


    @And("User Click On Business Name Generator")
    public void ClickOnBusinessNameGenerator() {
        new BrandingNavigation(driver).ClickOnBusinessNameGenerator();
    }


    @Then("Users can see Free Tools Title On This Page")
    public void  ValidateFreeTools() {
        new BrandingNavigation(driver).ValidateFreeTools();
    }
}

