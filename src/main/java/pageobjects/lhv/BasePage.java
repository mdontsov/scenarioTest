package pageobjects.lhv;

import driverfactory.DriverFactory;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage extends DriverFactory {

    public String getUrl() {
        return "https://www.lhv.ee/et/liising/taotlus";
    }

    @FindBy(css = "#iframe")
    public WebElement leasingFormFrame;

    @FindBy(css = "#account_type-P")
    public WebElement selectionPerson;

    @FindBy(css = "account_type-C")
    public WebElement selectionLegal;

    @FindBy(css = "#lease_type-HP")
    public WebElement financialLease;

    @FindBy(css = "lease_type-FL")
    public WebElement operatingLease;

    @FindBy(css = "#origin-price")
    public WebElement originPrice;

    @FindBy(css = "#vat_included")
    public WebElement vatIncluded;

    @FindBy(css = "#initial_percentage")
    public WebElement initialPercentage;

    @FindBy(css = "#initial")
    public WebElement initialMoneySum;

    @FindBy(css = "#duration_years")
    public List<WebElement> durationYears;

    @FindBy(css = "#duration_months")
    public List<WebElement> durationMonth;

    @FindBy(css = "#reminder_percentage")
    public WebElement reminderPercentage;

    @FindBy(css = "#reminder")
    public WebElement reminderMoneySum;

    @FindBy(css = "#payment_day")
    public List<WebElement> paymentDay;

    @FindBy(css = "button[value='Edasi']")
    public WebElement buttonForward;

    public BasePage() {
        super();
        PageFactory.initElements(webDriver, this);
    }

    public FluentWait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
            .withTimeout(60, TimeUnit.SECONDS)
            .pollingEvery(1, TimeUnit.SECONDS)
            .ignoring(NoSuchElementException.class);

    public WebDriver getDriver() {
        return webDriver;
    }
}
