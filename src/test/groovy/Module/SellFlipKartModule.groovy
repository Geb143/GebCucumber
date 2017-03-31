package Module

import geb.Module

/**
 * Created by E002465 on 30-03-2017.
 */
class SellFlipKartModule extends Module{

    static content={
        sellOnFKartLnk                      {$("._3Ji-EC li:nth-child(1)>a")}
        sellSmartLnk                        {$("nav[role='navigation'] .last.leaf>a")}
        insightAndTrends                    {$("a[href\$='insights-and-trends']")}
        activePage                          {$(".category>a.active")}
        leaderSpk                           {$("a[href\$='leaderspeak']")}
        succStories                         {$("a[href\$='success-stories']")}
        startSelling                        {$(".secondary li.first.leaf>a")}
        flipKart                            {$("._2OJxl5>a>img")}
        fpSellerLogo                            {$(".logo")}
    }
}
