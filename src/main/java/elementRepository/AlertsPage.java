package elementRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage {
	
@FindBy(xpath="//button[@class='btn btn-danger']")
private WebElement redButtonForAlertBox;
@FindBy(linkText="Alert with OK & Cancel")
private WebElement alertWithOkAndCancel;
@FindBy(xpath="//button[@class='btn btn-primary']")
private WebElement blueButtonForConfirm;
@FindBy(linkText="Alert with Textbox")
private WebElement alertWithTextbox;
@FindBy(xpath="//button[@class='btn btn-info']")
private WebElement blueButtonForPrompt;

public WebElement getRedButtonForAlertBox() {
	return redButtonForAlertBox;
}
public WebElement getAlertWithOkAndCancel() {
	return alertWithOkAndCancel;
}
public WebElement getBlueButtonForConfirm() {
	return blueButtonForConfirm;
}
public WebElement getAlertWithTextbox() {
	return alertWithTextbox;
}
public WebElement getBlueButtonForPrompt() {
	return blueButtonForPrompt;
}

}
