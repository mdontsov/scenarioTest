package driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class DriverFactory {

    protected WebDriver webDriver;

    public DriverFactory() {
        System.setProperty("webdriver.chrome.driver", "bin/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--dns-prefetch-disable");
        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();
    }
}
