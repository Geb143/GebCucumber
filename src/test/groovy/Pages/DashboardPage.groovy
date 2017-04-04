package Pages

import Module.DashboardModule
import Class.BasePage

/**
 * Created by E002183 on 3/28/2017.
 */
class DashboardPage extends BasePage{

    static at ={
        dashBoard.searchProduct
    }

    static content ={
        dashBoard       {module DashboardModule}
    }

    def searchProduct(String product){
        type({dashBoard.searchProduct}, product);
        click ({dashBoard.search});
    }

    def boolean verifyTitle(String text){
        Thread.sleep(1000);
       return (title.contains(text));
    }

    def selectProduct(){
        click ({dashBoard.firstProduct});
    }

    def addProductToCart(){
        click ({dashBoard.addtoCart})
    }

    def clickOnCart(){
        click ({dashBoard.cart})
    }

    def clickonPlaceOrder(){
        click({dashBoard.placeOrder})
    }
}
