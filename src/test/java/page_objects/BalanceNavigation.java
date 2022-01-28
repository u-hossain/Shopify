package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BalanceNavigation extends NavigationBar {
    private final By ShopifyManageButton4 = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--primary'][normalize-space()='Manage']");
    private final By ClickOnBalance = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--child'][normalize-space()='Balance']");
    private final By ClickOnRewards = By.xpath("//a[@class='marketing-nav__item marketing-nav__item--child'][normalize-space()='Rewards']");
    private final By ShopifyBalanceRewards = By.xpath("//h5[normalize-space()='shopify balance rewards']");

    private static final Logger LOGGER = LogManager.getLogger(BalanceNavigation.class);

    public BalanceNavigation(WebDriver driver) {
        super(driver);
    }

    public BalanceNavigation ClickManageButton() {
        LOGGER.debug("Click On Manage Button");
        ActOn.element(driver, ShopifyManageButton4).click();
        return this;
    }

    public BalanceNavigation ClickBalanceButton() {
        LOGGER.debug("Click On Balance Button");
        ActOn.element(driver, ClickOnBalance).click();
        return this;
    }

    public BalanceNavigation ClickRewardsButton() {
        LOGGER.debug("Click On Rewards Button");
        ActOn.element(driver, ClickOnRewards).click();
        return this;

    }

    public BalanceNavigation ValidateShopifyBalanceRewards() {
        LOGGER.debug("Users can see Shopify Balance Rewards Title On This Page");
        AssertThat.elementAssertions(driver, ShopifyBalanceRewards).elementIsDisplayed();
        return this;
    }

}
