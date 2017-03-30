package Pages

import Class.BasePage
import Module.DashboardModule
import org.testng.Assert;
/**
 * Created by E002183 on 3/28/2017.
 */
class DashboardPage extends BasePage{

    static at ={
        dashBoard.searchWikipediaTextField
    }

    static content ={
        dashBoard       {module DashboardModule}
    }

    def verifyTheTitle(String text){
        println()
        Assert.assertTrue(dashBoard.firstHeadingTitleText().trim().equals(text.trim()),"EXPECTED text: "+text+" but ACTUAL is: "+dashBoard.firstHeadingTitleText().trim())
    }
}
