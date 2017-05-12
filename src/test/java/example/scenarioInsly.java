package example;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobjects.insly.BasePage;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class scenarioInsly {

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

    @And("^(.*) is entered$")
    public void searchCriteriaIsEntered(String criteria) {
        try {
            Assert.assertTrue(basePage.googleSearchBar.isDisplayed());
            basePage.googleSearchBar.sendKeys(criteria);
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

    @Then("^print search results$")
    public void searchCriteriaIsDisplayedFirst() {
        try {
            for (int i = 0; i < basePage.searchResultsPage.searchResults.size(); i++) {
                Pattern pattern = Pattern.compile("\\bHotel Tallinn\\b.*");
                Matcher matcher = pattern.matcher(basePage.searchResultsPage.searchResults.get(i).getText());
                if (matcher.find()) {
                    System.out.println(matcher.group());
                }
            }
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
