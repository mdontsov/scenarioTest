package pageobjects;

import driverfactory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends DriverFactory {

    private String getUrl() {
        return "http://www.google.com";
    }

    @FindBy(css = ".gsfi:nth-child(1)")
    public WebElement googleSearchBar;

    public BasePage() {
        super();
        webDriver.get(getUrl());
        PageFactory.initElements(webDriver, this);
    }

    public WebDriverWait wait = new WebDriverWait(webDriver, 30);

    public SearchResultsPage searchResultsPage = PageFactory.initElements(webDriver, SearchResultsPage.class);

    public WebDriver getDriver() {
        return webDriver;
    }
}
