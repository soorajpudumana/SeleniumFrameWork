package utilityLibrary;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementUtility {
	
public void click(WebElement element) {
	try{
		
		  WebDriverWait wait = new WebDriverWait(DriverUtility.wd,10);
		  wait.until(ExpectedConditions.visibilityOf(element));
				
		element.click();
	}
	catch (Exception e){
		e.printStackTrace();
	}
}

public void enterData(WebElement element,String data) {
	try {
		WebDriverWait wait = new WebDriverWait(DriverUtility.wd,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(data);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void selectText(WebElement element,String text) {
	Select s1 = new Select(element);
	try {
	s1.selectByVisibleText(text);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void switchAlertsAccept() {
	try {
	
Alert a1 = DriverUtility.wd.switchTo().alert();
a1.accept();
}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}

public void switchAlertsCancel() {
	try {
	
Alert a1 = DriverUtility.wd.switchTo().alert();
a1.dismiss();
}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}

public void switchAlertsAddText(String addText) {
	try {
	
Alert a1 = DriverUtility.wd.switchTo().alert();
a1.sendKeys(addText);
a1.accept();
}
	catch(Exception e) {
		e.printStackTrace();
	}

}

public void switchFramesDefault() {
		try {
	DriverUtility.wd.switchTo().defaultContent();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
}

public void switchFrames(WebElement element) {
	try {
DriverUtility.wd.switchTo().frame(element);
}
	catch(Exception e) {
		e.printStackTrace();
	}
}


}


