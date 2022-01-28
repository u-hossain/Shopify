package step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.StartPageNavigation;


public class StartPageNavigationSteps {

    private static final Logger LOGGER = LogManager.getLogger(StartPageNavigationSteps.class);
    WebDriver driver = Hooks.driver;



    @When("User Click On Start Option")
    public void ClickOnStartButton() {
    new StartPageNavigation(driver).ClickOnStartButton();
    }

    @And("User Clicks On Start your Business")
    public void ClickOnStartYourBusiness() {
        new StartPageNavigation(driver).ClickOnStartYourBusiness();
    }


    @And("User Clicks On Build Your Brand")
    public void ClickOnBuildYourBrand() {
        new StartPageNavigation(driver).ClickOnBuildYourBrand();
    }


    @Then("Users can see Branding Tools Title On This Page")
    public void  ValidateBrandingToolsSuccessfully() {
        new StartPageNavigation(driver).ValidateBrandingTools();
    }
}
