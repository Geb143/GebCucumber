package Specs.flipkart

import Pages.DashboardPage
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import geb.testng.GebTest
import org.testng.Assert

/**
 * Created by E002183 on 3/13/2017.
 */
class FlipkartStepDef extends GebTest{

   @Given("I search the product \"(.*?)\" in the seacrh bar of Dashboard page")
    def I_Search_product_In_flipkart_Home_Page(String searchString) {
        to DashboardPage
       searchProduct(searchString);
    }

    @And("I verify the page title should contain \"(.*?)\"")
    def I_verify_Page_title(String verificationText){
        Assert.assertTrue(verifyTitle(verificationText), "Title is not matched");
    }

    @Then("^select \"([^\"]*)\" to add to card")
    def selectItem(String product) {
        selectProduct();
    }

    @And("^add the product to the cart")
    def add_to_cart(){
        addProductToCart();
    }

    @Then("^Viewcart page and the \"([^\"]*)\" should have been added to the cart")
    def viewcartPageAndTheShouldHaveBeenAddedToTheCart(String arg0) throws Throwable {
        clickOnCart();
    }

    @Then("^go to secure payment page")
    def go_securepayment(){

       clickonPlaceOrder();
    }
}
