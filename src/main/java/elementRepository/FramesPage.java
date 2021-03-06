package elementRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage {

@FindBy(xpath="//input[@type='text']")
private WebElement textBox;

@FindBy(linkText="Iframe with in an Iframe")
private WebElement secondTab;

@FindBy(xpath="//iframe[@src='MultipleFrames.html']")
private WebElement multipleFrames;

@FindBy(xpath="//iframe[@src='SingleFrame.html']")
private WebElement singleFrame;

@FindBy(name="SingleFrame")
private WebElement singleframe1;

public WebElement getTextBox() {
	return textBox;
}

public WebElement getSecondTab() {
	return secondTab;
}

public WebElement getMultipleFrames() {
	return multipleFrames;
}

public WebElement getSingleFrame() {
	return singleFrame;
}

public WebElement getSingleframe1() {
	return singleframe1;
}


}
