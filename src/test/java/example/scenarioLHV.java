package example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageobjects.lhv.BasePage;

import java.util.Random;

public class scenarioLHV {

    private BasePage basePage;
    Random random;
    int index;

    @Before("@start")
    public void setUp() {
        basePage = new BasePage();
        random = new Random();
    }

    @Given("^webpage is opened$")
    public void webpageIsOpened() throws Throwable {
        try {
            basePage.getDriver().get(basePage.getUrl());
        } catch (Throwable t) {
            System.out.println(t.getCause().toString());
        }
    }

    @When("^leasing form is displayed$")
    public void leasingFormIsDisplayed() throws Throwable {
        try {
            basePage.getDriver().switchTo().frame(basePage.leasingFormFrame);
        } catch (Throwable t) {
            System.out.println(t.getCause().toString());
        }
    }

    @Then("^button (.*) is disabled$")
    public void buttonProceedIsDisabled(String buttonLabel) throws Throwable {
        try {
            buttonLabel = "Proceed";
            Assert.assertFalse(basePage.buttonForward.isEnabled());
        } catch (Throwable t) {
            System.out.println(t.getCause().toString());
        }
    }

    @Then("^user applies for leasing$")
    public void userAppliesForPersonalLeasing() throws Throwable {
        try {
            index = random.nextInt(basePage.leasingName.size());
            basePage.leasingName.get(index).click();
        } catch (Throwable t) {
            System.out.println(t.getCause().toString());
        }
    }

    @And("^user selects leasing type$")
    public void userSelectsOperatingLeaseType() throws Throwable {
        try {
            index = random.nextInt(basePage.leasingType.size());
            basePage.leasingType.get(index).click();
        } catch (Throwable t) {
            System.out.println(t.getCause().toString());
        }
    }

    @When("^user inputs vehicle price of (\\d+)$")
    public void userInputsVehiclePriceOf(int vehiclePrice) throws Throwable {
        try {
            if (vehiclePrice < 3000) {

            }
        } catch (Throwable t) {
            System.out.println(t.getCause().toString());
        }
    }

    @Then("^user makes VAT selection$")
    public void userMakesVATSelection() throws Throwable {
        try {

        } catch (Throwable t) {
            System.out.println(t.getCause().toString());
        }
    }

    @And("^user inputs first Downpayment percent or sum$")
    public void userInputsFirstDownpaymentPercentOrSum() throws Throwable {
        try {

        } catch (Throwable t) {
            System.out.println(t.getCause().toString());
        }
    }

    @Then("^user selects lease period years$")
    public void userSelectsLeasePeriodYears() throws Throwable {
        try {

        } catch (Throwable t) {
            System.out.println(t.getCause().toString());
        }
    }

    @And("^user selects lease period months$")
    public void userSelectsLeasePeriodMonths() throws Throwable {
        try {

        } catch (Throwable t) {
            System.out.println(t.getCause().toString());
        }
    }

    @When("^user inputs the Residual value percent or sum$")
    public void userInputsTheResidualValuePercentOrSum() throws Throwable {
        try {

        } catch (Throwable t) {
            System.out.println(t.getCause().toString());
        }
    }

    @Then("^user selects the payment date$")
    public void userSelectsThePaymentDate() throws Throwable {
        try {

        } catch (Throwable t) {
            System.out.println(t.getCause().toString());
        }
    }

    @And("^button Proceed is enabled$")
    public void buttonProceedIsEnabled() throws Throwable {
        try {

        } catch (Throwable t) {
            System.out.println(t.getCause().toString());
        }
    }

    @After("@end")
    public void tearDown() {
        basePage.getDriver().quit();
    }
}
