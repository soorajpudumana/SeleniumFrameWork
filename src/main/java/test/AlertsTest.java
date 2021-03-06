package test;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import actionLibrary.AlertsPageLib;
import utilityLibrary.DriverUtility;
import utilityLibrary.ReportConfig;

public class AlertsTest {
	
AlertsPageLib alertsPageLib;
	
//@BeforeSuite
//public void openingBrowser() {
//	DriverUtility.openingBrowser("chrome");
//	alertsPageLib = new AlertsPageLib();
//}

@BeforeMethod
public void passingUrl(Method method) {
	DriverUtility.wd.get("http://demo.automationtesting.in/Alerts.html");
	ReportConfig.logger = ReportConfig.report.createTest(method.getName());
}


@Test(invocationCount = 2,enabled = true)
public void alertsTest() {
	alertsPageLib = new AlertsPageLib();
	alertsPageLib.alertPages();
}

}
