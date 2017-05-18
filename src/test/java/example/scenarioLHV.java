package example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageobjects.lhv.BasePage;

public class scenarioLHV {

    private BasePage basePage;

    @Before("@start")
    public void setUp() {
        basePage = new BasePage();
    }

    @Given("^webpage is opened$")
    public void webpageIsOpened() throws Throwable {
        basePage.getDriver().get(basePage.getUrl());
    }

    @When("^leasing form is displayed$")
    public void leasingFormIsDisplayed() throws Throwable {
        basePage.getDriver().switchTo().frame(basePage.leasingFormFrame);
    }

    @Then("^button (.*) is disabled$")
    public void buttonProceedIsDisabled(String buttonLabel) throws Throwable {
        buttonLabel = "Proceed";
        Assert.assertFalse(basePage.buttonForward.isEnabled());
    }

    @Then("^user applies for Personal leasing$")
    public void userAppliesForPersonalLeasing() throws Throwable {

    }

    @And("^user selects Operating lease type$")
    public void userSelectsOperatingLeaseType() throws Throwable {

    }

    @When("^user inputs vehicle price of (\\d+)$")
    public void userInputsVehiclePriceOf(int arg0) throws Throwable {

    }

    @Then("^user makes VAT selection$")
    public void userMakesVATSelection() throws Throwable {

    }

    @And("^user inputs first Downpayment percent or sum$")
    public void userInputsFirstDownpaymentPercentOrSum() throws Throwable {

    }

    @Then("^user selects lease period years$")
    public void userSelectsLeasePeriodYears() throws Throwable {

    }

    @And("^user selects lease period months$")
    public void userSelectsLeasePeriodMonths() throws Throwable {

    }

    @When("^user inputs the Residual value percent or sum$")
    public void userInputsTheResidualValuePercentOrSum() throws Throwable {

    }

    @Then("^user selects the payment date$")
    public void userSelectsThePaymentDate() throws Throwable {

    }

    @And("^button Proceed is enabled$")
    public void buttonProceedIsEnabled() throws Throwable {

    }

    @After("@end")
    public void tearDown() {
        basePage.getDriver().quit();
    }
}
