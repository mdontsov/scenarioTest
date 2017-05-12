package example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobjects.eventztoday.BasePage;

public class scenarioEventzToday {

    private BasePage basePage;

    @Before("@start")
    public void setUp() {
        basePage = new BasePage();
    }

    @Given("^webpage is opened$")
    public void webpageIsOpened() throws InterruptedException {
        try {
            basePage.getDriver().get(basePage.getUrl());
            basePage.wait.until(ExpectedConditions.elementToBeClickable(basePage.discoverButton));
        } catch (RuntimeException rte) {
            rte.printStackTrace();
        }
    }

    @When("^button Discover is clicked$")
    public void buttonDiscoverIsClicked() throws Throwable {
        basePage.discoverButton.click();
    }

    @Then("^events map is loaded$")
    public void eventzMapIsLoaded() throws Throwable {
        basePage.wait.until(ExpectedConditions.visibilityOf(basePage.mapPage.sectionMap));
    }

    @And("^events container is ready to be clicked$")
    public void eventzContainerIsClicked() throws Throwable {
        basePage.wait.until(ExpectedConditions.elementToBeClickable(basePage.mapPage.customMapCluster));
    }

    @Then("^specific event container is clicked$")
    public void specificEventContainerIsClicked() throws Throwable {
        basePage.mapPage.customMapCluster.click();
    }

    @And("^event content is displayed$")
    public void eventContentIsDisplayed() throws Throwable {
        try {
            basePage.wait.until(ExpectedConditions.elementToBeClickable(basePage.mapPage.transparentMapFile));
            basePage.wait.until(ExpectedConditions.visibilityOf(basePage.mapPage.transparentMapFile));
            basePage.mapPage.transparentMapFile.click();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            basePage.mapPage.transparentMapFile.click();
        }
    }

    @After("@end")
    public void tearDown() {
        basePage.getDriver().quit();
    }
}
