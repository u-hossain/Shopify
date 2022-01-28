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
import page_objects.BalanceNavigation;
import page_objects.BlogNavigation;
import utilities.ReadConfigFiles;

import java.util.List;
import java.util.Map;

public class BlogNavigationSteps {


    private static final Logger LOGGER = LogManager.getLogger(BlogNavigationSteps.class);
    WebDriver driver = Hooks.driver;


    @When("User Click On Learn Button")
    public void ClickLearnButton() {
        new BlogNavigation(driver).ClickLearnButton();
    }


    @And("User Click On Blog Button")
    public void ClickBlogButton() {
        new BlogNavigation(driver).ClickBlogButton();
    }


    @And("User Click Need An Idea Button")
    public void ClickNeedAnIdeaButton() {
        new BlogNavigation(driver).ClickNeedAnIdeaButton();
    }


    @Then("Users can see Find An Idea Title On This Page")
    public void  ValidateFindAnIdea() {
        new BlogNavigation(driver).ValidateFindAnIdea();
    }
}
