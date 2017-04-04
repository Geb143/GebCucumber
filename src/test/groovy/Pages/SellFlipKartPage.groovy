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

    }
    def leaderSpk(){
        click {sellFlipKartModule.sellOnFKartLnk}
        click {sellFlipKartModule.sellSmartLnk}
        click {sellFlipKartModule.leaderSpk}
//        at={sellFlipKartModule.activePage}

    }
    def succStories(){
        click {sellFlipKartModule.sellOnFKartLnk}
        click {sellFlipKartModule.sellSmartLnk}
        click {sellFlipKartModule.succStories}
//        at={sellFlipKartModule.activePage}

    }
    def startSelling(){
        click {sellFlipKartModule.sellOnFKartLnk}
        click {sellFlipKartModule.sellSmartLnk}
        click {sellFlipKartModule.startSelling}
//        at={sellFlipKartModule.fpSellerLogo}

    }
}
