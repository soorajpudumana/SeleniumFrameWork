package utilityLibrary;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class DriverUtility {
	
public static WebDriver wd;

public static void openingBrowser(String browserName) throws MalformedURLException {

switch (browserName) {

case "chrome":
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
	wd = new ChromeDriver();
	break;
	
case "ie":
	System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/src/main/resources/ieDriverServer.exe");
    wd = new InternetExplorerDriver();
    break;
    
case "grid":
	DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
	wd = new RemoteWebDriver(new URL("http://192.168.4.50:5555/wd/hub"), desiredCapabilities);

case "headless":
	wd = new HtmlUnitDriver(true);
	//wd = new HtmlUnitDriver(BrowserVersion.CHROME);
   break; 
}

HashMap<String,Object> chromePreferances = new HashMap<String,Object>();
chromePreferances.put("profile.default_content_settings.popups", 0);
chromePreferances.put("download.default_directory", System.clearProperty("user.dir"));

ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("prefs",chromePreferances);
wd = new ChromeDriver(options);

wd.manage().window().maximize();
wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
wd.manage().deleteAllCookies();
ReportConfig.intialiseconfig();
}




}


