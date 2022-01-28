package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {
    private final By ShopifyStartButton = By.xpath("(//button[@class='popover__trigger marketing-nav__item marketing-nav__item--primary'][normalize-space()='Start'])[1]");
    private final By ShopifySellButton = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--primary'][normalize-space()='Sell']");
    private final By ShopifyMarketButton = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--primary'][normalize-space()='Market']");
    private final By ShopifyManageButton = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--primary'][normalize-space()='Manage']");
    private final By ShopifyLearnButton = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--user']");
    private final By ShopifyStartButton1 = By.xpath("(//button[@class='popover__trigger marketing-nav__item marketing-nav__item--primary'][normalize-space()='Start'])[1]");
    private final By ShopifySellButton2 = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--primary'][normalize-space()='Sell']");
    private final By ShopifyMarketButton3 = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--primary'][normalize-space()='Market']");
    private final By ShopifyManageButton4 = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--primary'][normalize-space()='Manage']");
    private final By ShopifyLearnButton5 = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--user']");
    private final By ShopifyPricingButton = By.xpath("//a[@class='marketing-nav__item marketing-nav__item--user'][normalize-space()='Pricing']");


    private static final Logger LOGGER = LogManager.getLogger(NavigationBar.class);
    public WebDriver driver;

    public NavigationBar(WebDriver driver) {
        this.driver = driver;
    }

    public StartPageNavigation ClickOnStartButton() {
        LOGGER.debug("Click On Start Button");
        ActOn.element(driver, ShopifyStartButton).click();
        return new StartPageNavigation(driver);
    }

    public SellPageNavigation ClickOnSellButton() {
        LOGGER.debug("Click On Sell Button");
        ActOn.element(driver, ShopifySellButton).click();
        return new SellPageNavigation(driver);
    }

    public MarketPageNavigation ClickOnMarketButton() {
        LOGGER.debug("Click On Market Button");
        ActOn.element(driver, ShopifyMarketButton).click();
        return new MarketPageNavigation(driver);
    }

    public ManagePageNavigation ClickOnManageButton() {
        LOGGER.debug("Click On Manage Button");
        ActOn.element(driver, ShopifyManageButton).click();
        return new ManagePageNavigation(driver);
    }

    public LearnPageNavigation ClickOnLearnButton() {
        LOGGER.debug("Click On Learn Button");
        ActOn.element(driver, ShopifyLearnButton).click();
        return new LearnPageNavigation(driver);
    }

    public BrandingNavigation ClickStartButton() {
        LOGGER.debug("Click On Start Button");
        ActOn.element(driver, ShopifyStartButton1).click();
        return new BrandingNavigation(driver);
    }

    public OnlineStoreNavigation ClickSellButton() {
        LOGGER.debug("Click On Sell Button");
        ActOn.element(driver, ShopifySellButton2).click();
        return new OnlineStoreNavigation(driver);
    }

    public EmailMarketingNavigation ClickMarketButton() {
        LOGGER.debug("Click On Market Button");
        ActOn.element(driver, ShopifyMarketButton3).click();
        return new EmailMarketingNavigation(driver);
    }

    public BalanceNavigation ClickManageButton() {
        LOGGER.debug("Click On Manage Button");
        ActOn.element(driver, ShopifyManageButton4).click();
        return new BalanceNavigation(driver);
    }

    public BlogNavigation ClickLearnButton() {
        LOGGER.debug("Click On Learn Button");
        ActOn.element(driver, ShopifyLearnButton5).click();
        return new BlogNavigation(driver);
    }

    public PricingNavigation ClickOnPricingButton() {
        LOGGER.debug("Click On Pricing Button");
        ActOn.element(driver, ShopifyPricingButton).click();
        return new PricingNavigation(driver);
    }

}
