package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlogNavigation extends NavigationBar {
    private final By ShopifyLearnButton5 = By.xpath("//button[@class='popover__trigger marketing-nav__item marketing-nav__item--user']");
    private final By ClickOnBlog = By.xpath("//a[@class='marketing-nav__item marketing-nav__item--child'][normalize-space()='Blog']");
    private final By ClickOnNeedAnIdea = By.xpath("//a[normalize-space()='Need an Idea?']");
    private final By FindAnIdea = By.xpath("//h1[normalize-space()='Find An Idea']");

    private static final Logger LOGGER = LogManager.getLogger(BlogNavigation.class);

    public BlogNavigation(WebDriver driver) {
        super(driver);
    }


    public BlogNavigation ClickLearnButton() {
        LOGGER.debug("Click On Learn Button");
        ActOn.element(driver, ShopifyLearnButton5).click();
        return this;
    }

    public BlogNavigation ClickBlogButton() {
        LOGGER.debug("Click On Blog Button");
        ActOn.element(driver, ClickOnBlog).click();
        return this;
    }

    public BlogNavigation ClickNeedAnIdeaButton() {
        LOGGER.debug("Click On Need An Idea Button");
        ActOn.element(driver, ClickOnNeedAnIdea).click();
        return this;

    }

    public BlogNavigation ValidateFindAnIdea() {
        LOGGER.debug("Users can see Find An Idea Title On This Page");
        AssertThat.elementAssertions(driver, FindAnIdea).elementIsDisplayed();
        return this;
    }

}
