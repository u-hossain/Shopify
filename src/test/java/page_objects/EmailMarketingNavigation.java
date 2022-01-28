package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailMarketingNavigation extends NavigationBar {
    private final By ShopifyMarketButton3 = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--primary'][normalize-space()='Market']");
    private final By ClickEmailMarketing = By.xpath("//a[@class='marketing-nav__item marketing-nav__item--child'][normalize-space()='Email marketing']");
    private final By ClickOnLogInToCreateCampaign = By.xpath("//a[@data-event-action='hero']");
    private final By LogInContinueToShopify = By.xpath("//h1[normalize-space()='Log in']");

    private static final Logger LOGGER = LogManager.getLogger(EmailMarketingNavigation.class);

    public EmailMarketingNavigation(WebDriver driver) {
        super(driver);
    }

    public EmailMarketingNavigation ClickMarketButton() {
        LOGGER.debug("Click On Market Button");
        ActOn.element(driver, ShopifyMarketButton3).click();
        return this;
    }

    public EmailMarketingNavigation ClickOnEmailMarketing() {
        LOGGER.debug("Click On Email Marketing Button");
        ActOn.element(driver, ClickEmailMarketing).click();
        return this;
    }

    public EmailMarketingNavigation ClickOnLogInToCreateCampaign() {
        LOGGER.debug("Click On Log In To Create Campaign Button");
        ActOn.element(driver, ClickOnLogInToCreateCampaign).click();
        return this;

    }

    public EmailMarketingNavigation ValidateLogInContinueToShopify() {
        LOGGER.debug("Users can see Log In Continue To Shopify Title On This Page");
        AssertThat.elementAssertions(driver, LogInContinueToShopify).elementIsDisplayed();
        return this;
    }

}
