package actionLibrary;

import org.openqa.selenium.support.PageFactory;

import elementRepository.FramesPage;
import utilityLibrary.DriverUtility;
import utilityLibrary.ReportConfig;
import utilityLibrary.WebElementUtility;

public class FramesPageLib extends WebElementUtility{
	FramesPage framesPage = PageFactory.initElements(DriverUtility.wd, FramesPage.class);
	
public void framesValidation(String text) {
	try {
	switchFrames(framesPage.getSingleframe1());
	enterData(framesPage.getTextBox(),text);
	switchFramesDefault();
	click(framesPage.getSecondTab());
	switchFrames(framesPage.getMultipleFrames());
	switchFrames(framesPage.getSingleFrame());
	enterData(framesPage.getTextBox(),text);
	switchFramesDefault();
	//click(framesPage.getSingleframe1());
	ReportConfig.passCase("User able to validate the frames", "Frames_Validation_Successfull");
	}
	catch(Exception e)
	{
		ReportConfig.failCase("User not able to validate the frames", "Frames_Validation_Failed");
	}
}
	
}
