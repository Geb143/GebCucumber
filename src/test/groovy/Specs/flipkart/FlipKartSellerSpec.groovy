package Specs.flipkart

import Module.SellFlipKartModule
import Pages.SellFlipKartPage
import cucumber.api.java.en.*
import geb.testng.GebTest

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

}
