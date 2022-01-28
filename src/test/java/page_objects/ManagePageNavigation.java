package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManagePageNavigation extends NavigationBar {
    private final By ShopifyManageButton = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--primary'][normalize-space()='Manage']");
    private final By ClickManageEverything = By.xpath("//a[@class='marketing-nav__item marketing-nav__item--separated marketing-nav__item--child'][normalize-space()='Manage everything']");
    private final By ClickOnOrders = By.xpath("//p[normalize-space()='Orders']");
    private final By CentralizedOrderFulfillment = By.xpath("//p[normalize-space()='Centralized order fulfillment']");

    private static final Logger LOGGER = LogManager.getLogger(ManagePageNavigation.class);

    public ManagePageNavigation(WebDriver driver) {
        super(driver);
    }


    public ManagePageNavigation ClickOnManageButton() {
        LOGGER.debug("Click On Manage Button");
        ActOn.element(driver, ShopifyManageButton).click();
        return this;
    }

    public ManagePageNavigation ClickOnManageEverything() {
        LOGGER.debug("Click On Manage Everything");
        ActOn.element(driver, ClickManageEverything).click();
        return this;
    }

    public ManagePageNavigation ClickOnOrders() {
        LOGGER.debug("Click On Orders Button");
        ActOn.element(driver, ClickOnOrders).click();
        return this;
    }

    public ManagePageNavigation ValidateCentralizedOrderFulfillment() {
        LOGGER.debug("User Can See Centralized Order Fulfillment Title in This Page");
        ActOn.element(driver, CentralizedOrderFulfillment).click();
        return this;
    }
}
