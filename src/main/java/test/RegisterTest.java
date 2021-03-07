package test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import actionLibrary.RegisterPageLib;
import utilityLibrary.DriverUtility;
import utilityLibrary.ReportConfig;


public class RegisterTest {
	
RegisterPageLib registerPageLib;

@BeforeSuite
public void openingBrowser() throws MalformedURLException {
	DriverUtility.openingBrowser("chrome");
	registerPageLib= new RegisterPageLib();
}

@BeforeMethod
 public void applicationURL(Method method) {
	DriverUtility.wd.get("http://demo.automationtesting.in/Register.html");
    ReportConfig.logger = ReportConfig.report.createTest(method.getName());
}

@Test(dataProvider="registerTest")
public void register(String firstName,String lastName,String address,String emailAddress,String phone,String skills,String yearBox,String month,String day,String password1,String password2 ) {
    SoftAssert softAssert = new SoftAssert(); 
    softAssert.assertTrue(registerPageLib.validateHeaderLoad(), "Page not loaded");
	//Assert.assertTrue(registerPageLib.validateHeaderLoad(), "Page not loaded");
  	registerPageLib.registerUser(firstName,lastName,address,emailAddress,phone,skills,yearBox,month,day,password1,password2);
}

@DataProvider(name="registerTest")
public Object[][] getData(){
	return new Object[][] {{"Sooraj", "Narayanan", "123 st", "abc@gmail.com", "6545433456", "APIs", "2015", "May", "1", "1234","1234"},{"Sooraj", "Narayanan", "123 st", "abc@gmail.com", "6545433456", "APIs", "2015", "May", "1", "1234","1234"}};
}


}
