package utilityLibrary;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportConfig {

	public static ExtentReports report;
	public static ExtentTest logger;

	static Calendar cal = Calendar.getInstance();
	static SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss");
	public static String projectDirectory = System.getProperty("user.dir");
	public static String ReportLocation = System.getProperty("user.dir") + "/Report/"+sdf.format(cal.getTime())+"ExtentReport.html";

	public static void intialiseconfig() {
		report = createInstance(ReportLocation);
	}

	private static ExtentReports createInstance(String fileName) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
		htmlReporter.loadXMLConfig("extent-config.xml");
		report = new ExtentReports();
		report.attachReporter(htmlReporter);
		return report;
	}

	public static String captureScreenShot(WebDriver driver, String screenshotname) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			String des = projectDirectory + "\\Report\\Screenshots\\" + screenshotname + ".png";
			File destination = new File(des);
			FileUtils.copyFile(src, destination);
			return des;
		} catch (Exception e) {
			System.out.println("Exception while taking screen shot" + e.getMessage());
			return e.getMessage();
		}

	}

	public static void passCase(String ImgDesc, String imagename) throws Exception {
		String screenshot_path = captureScreenShot(DriverUtility.wd, imagename);
		MediaEntityModelProvider mediaModel = MediaEntityBuilder.createScreenCaptureFromPath(screenshot_path).build();
		logger.pass(ImgDesc, mediaModel);
	}

	public static void failCase(String failedDetail, String imagename) {
		try {
		String screenshot_path = captureScreenShot(DriverUtility.wd, imagename);
		MediaEntityModelProvider mediaModel = MediaEntityBuilder.createScreenCaptureFromPath(screenshot_path).build();
		logger.fail(failedDetail, mediaModel);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
