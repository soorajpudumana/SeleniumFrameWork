package test;

import java.lang.reflect.Method;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actionLibrary.FramesPageLib;
import utilityLibrary.DriverUtility;
import utilityLibrary.ReportConfig;

public class FramesTest {

FramesPageLib framesPageLib;

//@BeforeSuite
//public void openingBrowser() {
//	DriverUtility.openingBrowser("chrome");
//	alertsPageLib = new AlertsPageLib();
//}

@BeforeMethod
public void url(Method method) {
	DriverUtility.wd.get("http://demo.automationtesting.in/Frames.html");
	ReportConfig.logger = ReportConfig.report.createTest(method.getName());
	}

@Test
public void framesTest() {
	framesPageLib = new FramesPageLib();
	framesPageLib.framesValidation("Frames Testing");
}

@AfterSuite
public void generateReport() {
	ReportConfig.report.flush();
	DriverUtility.wd.get(ReportConfig.ReportLocation);
}
}
