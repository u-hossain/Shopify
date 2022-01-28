package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LearnPageNavigation extends NavigationBar {
    private final By ShopifyLearnButton = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--user']");
    private final By ClickHelpCenter = By.xpath("//a[@class='marketing-nav__item marketing-nav__item--child'][normalize-space()='Help Center']");
    private final By ClickOnIntroToShopify = By.xpath("//h3[normalize-space()='Intro to Shopify']");
    private final By IntroToShopify = By.xpath("//li[contains(text(),'Intro to Shopify')]");

    private static final Logger LOGGER = LogManager.getLogger(LearnPageNavigation.class);

    public LearnPageNavigation(WebDriver driver) {
        super(driver);
    }

    public LearnPageNavigation ClickOnLearnButton() {
        LOGGER.debug("Click On Learn Button");
        ActOn.element(driver, ShopifyLearnButton).click();
        return this;
    }

    public LearnPageNavigation ClickOnHelpCenter() {
        LOGGER.debug("Click On Help Center");
        ActOn.element(driver, ClickHelpCenter).click();
        return this;
    }

    public LearnPageNavigation ClickOnIntroToShopify() {
        LOGGER.debug("Click On Intro To Shopify");
        ActOn.element(driver, ClickOnIntroToShopify).click();
        return this;
    }

    public LearnPageNavigation ValidateIntroToShopify() {
        LOGGER.debug("User Can See Intro To Shopify Title in This Page");
        ActOn.element(driver, IntroToShopify).click();
        return this;
    }

}
