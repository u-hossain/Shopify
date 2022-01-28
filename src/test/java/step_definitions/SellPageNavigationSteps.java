package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.SellPageNavigation;
import utilities.ReadConfigFiles;


public class SellPageNavigationSteps {

    private static final Logger LOGGER = LogManager.getLogger(SellPageNavigationSteps.class);
    WebDriver driver = Hooks.driver;

    @Given("^User Navigates to The Shopify Home Page$")
    public void navigateToHomePage(){
        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("UrlShopify"));
        LOGGER.info("User is on the Shopify Home Page");
    }



    @When("^User Click On Sell Option$")
    public void ClickOnSellButton() { new SellPageNavigation(driver).ClickOnSellButton();
    }

    @And("^User Clicks On Sell EveryWhere Button$")
    public void ClickOnSellEveryWhere() { new SellPageNavigation(driver).ClickOnSellEveryWhere();
    }

    @And("^User Clicks On Online Store Button$")
    public void ClickOnLineStore() { new SellPageNavigation(driver).ClickOnLineStore();
    }

    @Then("^Users can see Custom Online Store Title On This Page$")
    public void ValidateCustomOnlineStoreSuccessfully() {
        new SellPageNavigation(driver).ValidateCustomOnlineStore();
    }
}


