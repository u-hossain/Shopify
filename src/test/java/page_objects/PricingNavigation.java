package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PricingNavigation extends NavigationBar {
    private final By ShopifyPricingButton = By.xpath("//a[@class='marketing-nav__item marketing-nav__item--user'][normalize-space()='Pricing']");
    private final By LearnMoreAboutShopifyPlus = By.xpath("//a[normalize-space()='Learn more about Shopify Plus']");
    private final By ClickOnLetsTalk = By.xpath("//a[@class='button button--theme-chartreuse button--size-md anime--appear-up']");
    private final By LetsTalkAboutBusiness = By.xpath("//h2[@id='modal-GlobalContactModal-heading']");


    private static final Logger LOGGER = LogManager.getLogger(PricingNavigation.class);
    public PricingNavigation(WebDriver driver) {
        super(driver);
    }

    public PricingNavigation ClickOnPricingButton() {
        LOGGER.debug("Click On Pricing Button");
        ActOn.element(driver, ShopifyPricingButton).click();
        return this;
    }

    public PricingNavigation ClickOnLearnMoreAboutShopifyPlus() {
        LOGGER.debug("Click On Learn More About Shopify Plus");
        ActOn.element(driver, LearnMoreAboutShopifyPlus).click();
        return this;
    }

    public PricingNavigation ClickOnLetsTalk () {
        LOGGER.debug("Click On Lets Talk ");
        ActOn.element(driver, ClickOnLetsTalk).click();
        return this;
    }

    public PricingNavigation ValidateLetsTalkAboutBusiness() {
        LOGGER.debug("User Can See Lets Talk About Business Title in This Page");
        ActOn.element(driver, LetsTalkAboutBusiness).click();
        return this;
    }
}
