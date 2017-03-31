package Pages
import Class.BasePage
import Module.WikiLoginModule

/**
 * Created by E002465 on 30-03-2017.
 */
class WikiLoginPage extends BasePage{
    static at ={wikiLoginModule.englishLink}
    static content={
        wikiLoginModule {module WikiLoginModule}
    }
    def login(def userName,def password){
        click {wikiLoginModule.englishLink}
        click {wikiLoginModule.loginLink}
        type({wikiLoginModule.uNameTxt},userName)
        type({wikiLoginModule.pwdTxt},password)
        click {wikiLoginModule.loginBtn}
    }
}
