package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SellPageNavigation extends NavigationBar {
    private final By ShopifySellButton = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--primary'][normalize-space()='Sell']");
    private final By ClickSellEveryWhere = By.xpath("//a[@class='marketing-nav__item marketing-nav__item--separated marketing-nav__item--child'][normalize-space()='Sell everywhere']");
    private final By ClickOnlineStore = By.xpath("//p[normalize-space()='Online store']");
    private final By CustomOnlineStore = By.xpath("//p[normalize-space()='Custom online store']");


    private static final Logger LOGGER = LogManager.getLogger(SellPageNavigation.class);

    public SellPageNavigation(WebDriver driver) {
        super(driver);
    }

    public SellPageNavigation ClickOnSellButton() {
        LOGGER.debug("Click On Sell Button");
        ActOn.element(driver, ShopifySellButton).click();
        return this;
    }

    public SellPageNavigation ClickOnSellEveryWhere() {
        LOGGER.debug("Click On Sell EveryWhere");
        ActOn.element(driver, ClickSellEveryWhere).click();
        return this;
    }

    public SellPageNavigation ClickOnLineStore() {
        LOGGER.debug("Click On Line Store Button");
        ActOn.element(driver, ClickOnlineStore).click();
        return this;
    }

    public SellPageNavigation ValidateCustomOnlineStore() {
        LOGGER.debug("Users can see Custom Online Store Title On This Page");
        AssertThat.elementAssertions(driver, CustomOnlineStore).elementIsDisplayed();
        return this;
    }

}
