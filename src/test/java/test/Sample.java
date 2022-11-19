package test;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

@Listeners(utility.Listener.class)

public class Sample {
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void configureReports() {
		reports = Reports.createExtentReports();
	
	
	@Test
	public void test1() {
		test =reports.createTest("test1");
		
		System.out.println("test1");
	}
	
	@Test(dependsOnMethods ="test3")
	public void test2() {
		test =reports.createTest("test2");
		System.out.println("test2");
	}
	
	@Test (timeOut =2000)
	public void test3() throws InterruptedException {
		test =reports.createTest("test3");
		Thread.sleep(3000);
		System.out.println("test3");
	}
	
	@AfterMethod
	public void publishResult (ITestResult result) {
		if(result.getStatus() == ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else if (result.getStatus() == ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
		}
		
		else
		{
			test.log(Status.SKIP, result.getName());
		}
	}
	
	@AfterMethod
	public void createReport() {
		reports.flush();
	}
}
