package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends BaseClass implements ITestListener {
	public void onTestStart(ITestResult result) {
	System.out.println("Test is started "+ result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test pass "+ result.getName());
	}
	public void onTestFailure(ITestResult result) {
//		try {
	//		Screenshot.clickScreenshoot(driver, result.getName());
	//	} catch (IOException e) {
	//		e.printStackTrace();
	//	}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped "+ result.getName());
	}
}
