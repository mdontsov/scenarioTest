package pages;

import driverfactory.DriverFactory;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends DriverFactory {

    private String getUrl() {
        return "http://www.google.com";
    }

    public BasePage() {
        super();
        this.webDriver.get(getUrl());
        PageFactory.initElements(webDriver, this);
    }
}
