package pageobjects.eventztoday;

import driverfactory.DriverFactory;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

public class BasePage extends DriverFactory {

    public String getUrl() {
        return "https://eventzdemo.dev.eventz.today/en";
    }

    @FindBy(css = ".buttons .bubster-theme-background-color")
    public WebElement discoverButton;

    public BasePage() {
        super();
        PageFactory.initElements(webDriver, this);
    }

    public FluentWait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
            .withTimeout(60, TimeUnit.SECONDS)
            .pollingEvery(1, TimeUnit.SECONDS)
            .ignoring(NoSuchElementException.class);

    public MapPage mapPage = PageFactory.initElements(webDriver, MapPage.class);

    public WebDriver getDriver() {
        return webDriver;
    }
}
