package Class

import geb.Page

import java.text.DateFormat
import java.text.SimpleDateFormat

/**
 * Created by E002183 on 3/28/2017.
 */
class BasePage extends Page{

    public void type(Closure closure, String value){
        waitFor closure
        closure() << value
    }

    public void click(Closure closure){
        waitFor closure
        closure().click()
    }

    def generateRandom() {
        Random r = new Random(System.currentTimeMillis());
        return 1000000000 + r.nextInt(2000000000);
    }

    def getCurrentDate(){
        Date currDate = new Date()
        DateFormat dFormat = new SimpleDateFormat("MMM dd, yyyy")
        return dFormat.format(currDate).toString()
    }
}
