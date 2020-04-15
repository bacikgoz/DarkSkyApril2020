package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import runnerTest.webPages.DarkSkyHomePage;

public class DarkSkySD {

    private DarkSkyHomePage darkSkyHomePage=new DarkSkyHomePage();

    @Given("^I am on DarkSky Home Page$")
    public void setup() throws InterruptedException {
        darkSkyHomePage.setLocationName();
    }
    @Then("^I verify timeline is displayed with two hours incremented$")
    public void verifyTimes() throws InterruptedException {
        darkSkyHomePage.verifyTimeline();
    }
    @Then("^I verify the lowest and the highest temp is displayed correctly$")
    public void verifyTemps() throws InterruptedException {
        darkSkyHomePage.verifyTemperatures();
    }

}