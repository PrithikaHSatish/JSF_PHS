package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReporterNG {
	static ExtentReports extent;
	
	public static ExtentReports getReportObject() {
		String path =System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Open Cart Test Results");
		reporter.config().setDocumentTitle("Open Cart Test Results");
		
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Prithika HS"); 
		return extent;
		
		
	}

}
