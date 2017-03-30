package Listeners;

import Reports.GenerateReport;
import org.testng.IExecutionListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Created by amit.rawat on 06/01/16.
 */
public class TestNGExecutionListener implements IExecutionListener,ITestListener {
    @Override
    public void onExecutionStart() {

    }

    @Override
    public void onExecutionFinish() {
        //GenerateReport.GenerateMasterthoughtReport();
    }

    @Override
    public void onTestStart(ITestResult result) {

    }


    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {

    }


    @Override
    public void onTestSkipped(ITestResult result) {

    }


    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }


    @Override
    public void onStart(ITestContext context) {

    }


    @Override
    public void onFinish(ITestContext context) {

    }
}
