package example;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobjects.BasePage;
import java.io.PrintWriter;
import java.io.StringWriter;

public class scenarioTest {

    private BasePage basePage;

    @Given("^Google webpage is opened$")
    public void webpageIsOpened() {
        try {
            basePage = new BasePage();
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            System.out.println(stringWriter.toString());
        }
    }

    @And("^search criteria is entered$")
    public void searchCriteriaIsEntered() {
        try {
            Assert.assertTrue(basePage.googleSearchBar.isDisplayed());
            basePage.googleSearchBar.sendKeys("hotel tallinn");
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            System.out.println(stringWriter.toString());
        }
    }

    @Then("^Enter key is pressed$")
    public void enterKeyIsPressed() {
        try {
            basePage.googleSearchBar.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            System.out.println(stringWriter.toString());
        }
    }

    @When("^search results are displayed$")
    public void searchResultsAreDisplayed() {
        try {
            basePage.wait.until(ExpectedConditions.visibilityOf(basePage.searchResultsPage.resultsBlock));
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            System.out.println(stringWriter.toString());
        }
    }

    @Then("^search criteria result is listed first$")
    public void searchCriteriaIsDisplayedFirst() {
        try {
            String str = basePage.searchResultsPage.searchResults.get(0).getText();
            System.out.println(str);
            Assert.assertTrue(str.toLowerCase().contains("hotel tallinn"));
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            System.out.println(stringWriter.toString());
        }
    }

    @After("@end")
    public void tearDown() {
        basePage.getDriver().quit();
    }
}
