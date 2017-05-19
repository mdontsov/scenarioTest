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

    @FindBy(css = "#account_type-C")
    public WebElement selectionLegal;

    @FindBy(xpath = "//*[@id='form1']/table/tbody[1]/tr[1]/td/label/input")
    public List<WebElement> leasingName;

    @FindBy(css = "#lease_type-HP")
    public WebElement financialLease;

    @FindBy(css = "lease_type-FL")
    public WebElement operatingLease;

    @FindBy(xpath = "//*[@id='form1']/table/tbody[1]/tr[2]/td[1]/label/input")
    public List<WebElement> leasingType;

    @FindBy(css = "#origin-price")
    public WebElement originPrice;

    @FindBy(css = ".select.grid3")
    public WebElement vatPayment;

    @FindBy(xpath = "//*[@id='vat_scheduling']/option")
    public List<WebElement> vatScheduling;

    @FindBy(css = "#vat_included")
    public WebElement vatIncluded;

    @FindBy(css = "#initial_percentage")
    public WebElement initialPercentage;

    @FindBy(xpath = "//*[@id='duration_years']/option")
    public List<WebElement> leasePeriodYears;

    @FindBy(xpath = "//*[@id='duration_months']/option")
    public List<WebElement> leasePeriodMonths;

    @FindBy(css = "#reminder_percentage")
    public WebElement reminderPercentage;

    @FindBy(xpath = "//*[@id='payment_day']/option")
    public List<WebElement> paymentDay;

    @FindBy(css = "button[value='Edasi']")
    public WebElement buttonForward;

    public BasePage() {
        super();
        PageFactory.initElements(webDriver, this);
    }

    public FluentWait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
            .withTimeout(5, TimeUnit.SECONDS)
            .pollingEvery(1, TimeUnit.SECONDS)
            .ignoring(NoSuchElementException.class);

    public WebDriver getDriver() {
        return webDriver;
    }
}
