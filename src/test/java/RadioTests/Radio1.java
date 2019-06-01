package RadioTests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;

import ExtentReports.ExtentHtmlManager;

public class Radio1 {
	@Test
	public void ConnectRadioTest() {
		
		System.out.println("Inside ConnectRadioTest");
		System.out.println("Hello world");
		ExtentReports report = ExtentHtmlManager.ExtentReports();
		
		ExtentTest test = report.createTest("Testing ConnectRadioTest");
		test.log(Status.INFO, "ConnectRadioTest started");
		test.log(Status.INFO, "ConnectRadioTest ended");
		
		test.log(Status.PASS, "ConnectRadioTest Passed");
		
		report.flush();
	}
	
	@Test
	public void DisConnectRadioTest() throws IOException {
		System.out.println("Inside DisConnectRadioTest");

		ExtentReports report = ExtentHtmlManager.ExtentReports();
		
		ExtentTest test = report.createTest("Testing DisConnectRadioTest");
		test.log(Status.INFO, "DisConnectRadioTest started");
		test.log(Status.INFO, "DisConnectRadioTest ended");
		
//		test.log(Status.FAIL, "DisConnectRadioTest Failed");
		test.fail("details", 
				MediaEntityBuilder.createScreenCaptureFromPath("ScreenShot1.png").build());
		
		report.flush();
		Assert.fail();
	}
}
