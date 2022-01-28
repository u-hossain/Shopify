package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrandingNavigation extends NavigationBar {
    private final By ShopifyStartButton1 = By.xpath("(//button[@class='popover__trigger marketing-nav__item marketing-nav__item--primary'][normalize-space()='Start'])[1]");
    private final By ClickBranding = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--child'][normalize-space()='Branding']");
    private final By ClickOnBusinessNameGenerator = By.xpath("//a[@class='marketing-nav__item marketing-nav__item--child'][normalize-space()='Business name generator']");
    private final By FreeTools = By.xpath("//a[@class='body-link--reverse']");

    private static final Logger LOGGER = LogManager.getLogger(BrandingNavigation.class);

    public BrandingNavigation(WebDriver driver) {
        super(driver);
    }


    public BrandingNavigation ClickStartButton() {
        LOGGER.debug("Click On Start Button");
        ActOn.element(driver, ShopifyStartButton1).click();
        return this;
    }

    public BrandingNavigation ClickOnBranding() {
        LOGGER.debug("Click On Branding Button");
        ActOn.element(driver, ClickBranding).click();
        return this;
    }

    public BrandingNavigation ClickOnBusinessNameGenerator() {
        LOGGER.debug("Click On Business Name Generator");
        ActOn.element(driver, ClickOnBusinessNameGenerator).click();
        return this;

    }

    public BrandingNavigation ValidateFreeTools() {
        LOGGER.debug("Users can see Free Tools Title On This Page");
        AssertThat.elementAssertions(driver, FreeTools).elementIsDisplayed();
        return this;
    }
}
