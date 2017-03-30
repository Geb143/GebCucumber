package Specs

import cucumber.api.Scenario
import cucumber.api.java.After
import cucumber.api.java.Before
import geb.testng.GebTest
import org.apache.commons.io.FileUtils
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot

import java.text.SimpleDateFormat

/**
 * Created by e002222 on 17-10-2016.
 */
class HookSpec extends GebTest {

    @Before
    public void beforeScenario() {
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dest = new File("reports\\screenshot\\"+scenario+".png");
            FileUtils.copyFile(scr, dest);
            Thread.sleep(3000);
        }
    }
}

