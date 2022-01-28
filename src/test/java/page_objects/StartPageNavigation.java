package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPageNavigation extends NavigationBar {
    private final By ShopifyStartButton = By.xpath("(//button[@class='popover__trigger marketing-nav__item marketing-nav__item--primary'][normalize-space()='Start'])[1]");
    private final By ClickStartYourBusiness = By.xpath("(//a[@class='marketing-nav__item marketing-nav__item--separated marketing-nav__item--child'][normalize-space()='Start your business'])[1]");
    private final By ClickOnBranding = By.xpath("//p[normalize-space()='Build your brand']");
    private final By BrandingTools = By.xpath("(//p[normalize-space()='Branding tools'])[1]");

    private static final Logger LOGGER = LogManager.getLogger(StartPageNavigation.class);

    public StartPageNavigation(WebDriver driver) {
        super(driver);
    }

    public StartPageNavigation ClickOnStartButton(){
        LOGGER.debug("Click On Start Button");
        ActOn.element(driver, ShopifyStartButton).click();
        return this;
    }

    public StartPageNavigation ClickOnStartYourBusiness() {
        LOGGER.debug("Click On Start Your Business");
        ActOn.element(driver, ClickStartYourBusiness).click();
        return this;
    }

    public StartPageNavigation ClickOnBuildYourBrand() {
        LOGGER.debug("Click On Build your Band Button");
        ActOn.element(driver, ClickOnBranding).click();
        return this;

    }

    public StartPageNavigation ValidateBrandingTools() {
        LOGGER.debug("Users can see Branding Tools Title On This Page");
        AssertThat.elementAssertions(driver, BrandingTools).elementIsDisplayed();
        return this;

    }
}
