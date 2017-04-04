package Specs.WikiPedia

import Pages.WikiLoginPage
import cucumber.api.PendingException
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import geb.testng.GebTest

/**
 * Created by E002465 on 30-03-2017.
 */
class WikiLoginSpec extends GebTest{
    @Given("^I login with correct \"([^\"]*)\" and \"([^\"]*)\" in login page")
    def void iLoginWithCorrectAnd(String arg0, String arg1) throws Throwable {
        to WikiLoginPage
        login("harishwiki","Test_1234")

    }

    @Then("^I should be on HomePage")
    def void iShouldBeOnHomePage() throws Throwable {

    }
}

