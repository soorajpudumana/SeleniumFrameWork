package actionLibrary;

import org.openqa.selenium.support.PageFactory;

import elementRepository.AlertsPage;
import utilityLibrary.DriverUtility;
import utilityLibrary.ReportConfig;
import utilityLibrary.WebElementUtility;

public class AlertsPageLib extends WebElementUtility {
	
	AlertsPage alertsPage = PageFactory.initElements(DriverUtility.wd, AlertsPage.class);
	
	public void alertPages() {
		try {
	click(alertsPage.getRedButtonForAlertBox());
	switchAlertsAccept();
	click(alertsPage.getAlertWithOkAndCancel());
	click(alertsPage.getBlueButtonForConfirm());
	switchAlertsCancel();
	click(alertsPage.getAlertWithTextbox());
	click(alertsPage.getBlueButtonForPrompt());
	switchAlertsAddText("Adding a text");
	ReportConfig.passCase("User able to validate alert page", "Alerts_Validation_Successful");
		}
		catch (Exception e)
		{
			ReportConfig.failCase("User not able to validate alert page", "Assert_Validation_Failed");
		}
		}
	}


