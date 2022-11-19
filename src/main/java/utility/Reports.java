package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

	public static ExtentReports createExtentReports() {
		ExtentReports reports =new ExtentReports();
		ExtentSparkReporter sparkreport = new ExtentSparkReporter("extentreports.html");
		reports.attachReporter(sparkreport);
		reports.setSystemInfo("CreatedBy","Pravin");
		reports.setSystemInfo("TestSuite","Regression");
		return reports;
	}
		
	}
