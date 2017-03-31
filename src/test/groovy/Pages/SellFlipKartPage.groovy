package Pages
import Class.BasePage
import Module.SellFlipKartModule
import org.openqa.selenium.By

/**
 * Created by E002465 on 31-03-2017.
 */
class SellFlipKartPage extends BasePage{
    static at={sellFlipKartModule.flipKart}
    static content={
        sellFlipKartModule {module SellFlipKartModule}
    }
    def insightAndTrends(){
        click {sellFlipKartModule.sellOnFKartLnk}
        click {sellFlipKartModule.sellSmartLnk}
        click {sellFlipKartModule.insightAndTrends}
//        at={sellFlipKartModule.activePage}
         assert driver.findElement(By.cssSelector(".category>a.active")).getText().equalsIgnoreCase("Insights and trends")
    }
    def leaderSpk(){
        click {sellFlipKartModule.sellOnFKartLnk}
        click {sellFlipKartModule.sellSmartLnk}
        click {sellFlipKartModule.leaderSpk}
//        at={sellFlipKartModule.activePage}
        assert driver.findElement(By.cssSelector(".category>a.active")).getText().equalsIgnoreCase("Leaderspeak")
    }
    def succStories(){
        click {sellFlipKartModule.sellOnFKartLnk}
        click {sellFlipKartModule.sellSmartLnk}
        click {sellFlipKartModule.succStories}
//        at={sellFlipKartModule.activePage}
        assert driver.findElement(By.cssSelector(".category>a.active")).getText().equalsIgnoreCase("Success Stories")
    }
    def startSelling(){
        click {sellFlipKartModule.sellOnFKartLnk}
        click {sellFlipKartModule.sellSmartLnk}
        click {sellFlipKartModule.startSelling}
//        at={sellFlipKartModule.fpSellerLogo}
        assert driver.findElement(By.cssSelector(".logo")).isDisplayed()
    }
}
