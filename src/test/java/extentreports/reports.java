package extentreports;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reports {
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
	public void startreport() {
		String path=System.getProperty("user.dir")+"/test-output/MyReport.html";
		extent=new ExtentReports();
		extent.setSystemInfo(path, path);
		
		

	}
	@Test
public void reportpaa() {
	
}
	@Test
public void reportfail() {
	
}
	@AfterMethod
public void result() {
	
}
	@AfterTest
public void end() {
	
}
}
