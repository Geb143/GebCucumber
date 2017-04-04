package Module

import geb.Module

/**
 * Created by E002183 on 3/28/2017.
 */
class DashboardModule extends Module{

    static content = {
        searchProduct            {$("input",'name':'q')}
        search                   {$("._2BhAHa")}
        firstProduct             {$("div", text:"Moto M (Grey, 64 GB)")}
        addtoCart                {$("._2AkmmA._3Plo8Q._19RW-r")}
        cart                     {$("._3NFO0d")}
        placeOrder               {$("._2AkmmA._3qVHVC._7UHT_c")}
    }
}
