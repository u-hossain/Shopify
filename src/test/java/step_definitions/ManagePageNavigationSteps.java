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
import page_objects.ManagePageNavigation;
import page_objects.MarketPageNavigation;
import utilities.ReadConfigFiles;

import java.util.List;
import java.util.Map;

public class ManagePageNavigationSteps {


    private static final Logger LOGGER = LogManager.getLogger(ManagePageNavigationSteps.class);
    WebDriver driver = Hooks.driver;

    @When("User Click On Manage Option")
    public void ClickOnManageButton() {
        new ManagePageNavigation(driver).ClickOnManageButton();
    }

    @And("User Clicks On Manage Everything")
    public void ClickOnManageEverything() {
        new ManagePageNavigation(driver).ClickOnManageEverything();
    }


    @And("User Click On Orders Button")
    public void ClickOnOrders() {
        new ManagePageNavigation(driver).ClickOnOrders();
    }


    @Then("User Can See Centralized Order Fulfillment Title in This Page")
    public void  ValidateCentralizedOrderFulfillment() {
        new ManagePageNavigation(driver).ValidateCentralizedOrderFulfillment();
    }

}
