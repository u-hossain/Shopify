package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarketPageNavigation extends NavigationBar {
    private final By ShopifyMarketButton = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--primary'][normalize-space()='Market']");
    private final By ClickMarketYourBusiness = By.xpath("//a[@class='marketing-nav__item marketing-nav__item--separated marketing-nav__item--child'][normalize-space()='Market your business']");
    private final By ClickOnAudience = By.xpath("//p[normalize-space()='Audience']");
    private final By AudienceTargeting = By.xpath("//p[normalize-space()='Audience targeting']");


    private static final Logger LOGGER = LogManager.getLogger(MarketPageNavigation.class);

    public MarketPageNavigation(WebDriver driver) {
        super(driver);
    }

    public MarketPageNavigation ClickOnMarketButton() {
        LOGGER.debug("Click On Market Button");
        ActOn.element(driver, ShopifyMarketButton).click();
        return this;
    }

    public MarketPageNavigation ClickOnMarketYourBusiness() {
        LOGGER.debug("Click On Market Your Business");
        ActOn.element(driver, ClickMarketYourBusiness).click();
        return this;
    }

    public MarketPageNavigation ClickOnAudience() {
        LOGGER.debug("Click On Audience Button");
        ActOn.element(driver, ClickOnAudience).click();
        return this;
    }

    public MarketPageNavigation ValidateAudienceTargeting() {
        LOGGER.debug("User Can See Audience Targeting Title in This Page");
        ActOn.element(driver, AudienceTargeting).click();
        return this;
    }

}
