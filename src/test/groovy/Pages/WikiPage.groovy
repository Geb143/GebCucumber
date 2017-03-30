package Pages

import Module.WikiModule
import Class.BasePage
import cucumber.api.java.en.Given

/**
 * Created by E002183 on 3/13/2017.
 */
class WikiPage extends BasePage{

    static at = {wikiHome.searchField}

    static content ={
        wikiHome  {module WikiModule}
    }

    def searchForText(String searchString){
        type({wikiHome.searchField},searchString)
        click ({wikiHome.searchButton})
    }
}
