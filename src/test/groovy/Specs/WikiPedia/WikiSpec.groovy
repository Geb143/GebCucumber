package Specs.WikiPedia

import Pages.DashboardPage
import Pages.SearchResultsPage
import Pages.WikiPage
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import geb.testng.GebTest

/**
 * Created by E002183 on 3/13/2017.
 */
class WikiSpec extends GebTest{

    @Given("I search the text \"(.*?)\" in Wiki Home Page")
    def I_Search_For_String_In_Wiki_Home_Page(String searchString) {
        to WikiPage
        searchForText(searchString)

        at DashboardPage
    }

    @And("I open the first link and verify the title to be \"(.*?)\"")
    def I_Open_First_Link(String verificationText){
        verifyTheTitle(verificationText)
    }
}
