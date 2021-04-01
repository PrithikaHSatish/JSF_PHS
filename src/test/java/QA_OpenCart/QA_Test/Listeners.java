package QA_OpenCart.QA_Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.base;
import resources.extentReporterNG;

public class Listeners extends base implements ITestListener{

	ExtentReports extent=extentReporterNG.getReportObject();
	ExtentTest test;
	ThreadLocal<ExtentTest> extentTest= new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		String methodName= result.getMethod().getMethodName();
		test=extent.createTest(methodName);
		extentTest.set(test);			
	}

	public void onTestSuccess(ITestResult result) {
		
		extentTest.get().log(Status.PASS, "Test Passed");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		extentTest.get().fail(result.getThrowable());
		String methodName= result.getMethod().getMethodName();
		
		try {
			driver= (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		}  catch (Exception e) {
			
		}
		try {
			extentTest.get().addScreenCaptureFromPath(getScreenShot(methodName, driver), methodName);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		
		extent.flush();
		
	}

}
