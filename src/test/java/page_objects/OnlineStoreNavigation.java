package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlineStoreNavigation extends NavigationBar {
    private final By ShopifySellButton2 = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--primary'][normalize-space()='Sell']");
    private final By ClickOnlineStore = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--child'][normalize-space()='Online store']");
    private final By ClickOnOverView = By.xpath("//div[@id='Popover6']//a[@class='marketing-nav__item marketing-nav__item--child'][normalize-space()='Overview']");
    private final By ShopifyOnlineStore = By.xpath("//p[@class='section-heading__kicker heading--5 color-cyan-40']");

    private static final Logger LOGGER = LogManager.getLogger(OnlineStoreNavigation.class);

    public OnlineStoreNavigation(WebDriver driver) {
        super(driver);
    }

    public OnlineStoreNavigation ClickSellButton() {
        LOGGER.debug("Click On Sell Button");
        ActOn.element(driver, ShopifySellButton2).click();
        return this;
    }

    public OnlineStoreNavigation ClickOnLineStore() {
        LOGGER.debug("Click On Line Store Button");
        ActOn.element(driver, ClickOnlineStore).click();
        return this;
    }

    public OnlineStoreNavigation ClickOnOverView() {
        LOGGER.debug("Click On OverView Button");
        ActOn.element(driver, ClickOnOverView).click();
        return this;

    }

    public OnlineStoreNavigation ValidateShopifyOnlineStore() {
        LOGGER.debug("Users can see Shopify Online Store Title On This Page");
        AssertThat.elementAssertions(driver, ShopifyOnlineStore).elementIsDisplayed();
        return this;
    }
}
