package step_definitions;

import command_providers.ActOn;
import command_providers.AssertThat;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.LearnPageNavigation;
import page_objects.PricingNavigation;
import utilities.ReadConfigFiles;

import java.util.List;
import java.util.Map;

public class PricingNavigationSteps {


    private static final Logger LOGGER = LogManager.getLogger(PricingNavigationSteps.class);
    WebDriver driver = Hooks.driver;


    @When("User Click On Pricing Option")
    public void ClickOnPricingButton() {
        new PricingNavigation(driver).ClickOnPricingButton();
    }

    @And("User Clicks On Learn More About Shopify Plus")
    public void ClickOnLearnMoreAboutShopifyPlus() {
        new PricingNavigation(driver).ClickOnLearnMoreAboutShopifyPlus();
    }


    @And("User Clicks On Lets Talk")
    public void ClickOnLetsTalk() {
        new PricingNavigation(driver).ClickOnLetsTalk();
    }


    @Then("User Can See Lets Talk About Business Title in This Page")
    public void  ValidateLetsTalkAboutBusiness() {
        new PricingNavigation(driver).ValidateLetsTalkAboutBusiness();
    }
}
