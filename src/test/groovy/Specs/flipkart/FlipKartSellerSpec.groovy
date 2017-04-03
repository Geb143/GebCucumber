package Specs.flipkart

import Module.SellFlipKartModule
import Pages.SellFlipKartPage
import cucumber.api.PendingException
import cucumber.api.java.en.*
import geb.testng.GebTest
import org.openqa.selenium.By

/**
 * Created by E002465 on 31-03-2017.
 */
class FlipKartSellerSpec extends GebTest{
    @Given("I click on insightAndTrends link of flipkart seller page")
    def insightAndTrendsStep(){
        to SellFlipKartPage
        insightAndTrends()
    }

    @Given("^I click on leaderSpk link of flipkart seller page")
    def leaderSpkStep(){
        to SellFlipKartPage
        leaderSpk()
    }

    @Given("I click on succStories link of flipkart seller page")
    def succStoriesStep(){
        to SellFlipKartPage
        succStories()
    }
    @Given("I click on startSelling link of flipkart seller page")
    def startSellingStep(){
        to SellFlipKartPage
        startSelling()
    }

    @Then("^I should be on insightAndTrends page")
    public void iShouldBeOnInsightAndTrendsPage() {
        assert $(".category>a.active").text()=="Insights and trends"
    }

    @Then("^I should be on leaderSpk page")
    public void iShouldBeOnLeaderSpkPage() {
        assert $(".category>a.active").text()=="Leaderspeak"
    }

    @Then("^I should be on succStories page")
    public void iShouldBeOnSuccStoriesPage() {
        assert $(".category>a.active").text()=="Success Stories"
    }

    @Then("^I should be on startSelling page")
    public void iShouldBeOnStartSellingPage() {
        assert $(".logo").isDisplayed()
    }
}
