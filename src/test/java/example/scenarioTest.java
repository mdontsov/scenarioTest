package example;

import cucumber.api.java.en.Given;
import pages.BasePage;

public class scenarioTest {

    @Given("^webpage is opened$")
    public void webpageIsOpened() throws Throwable {
        BasePage basePage = new BasePage();
        basePage.getDriver().quit();
    }
}
