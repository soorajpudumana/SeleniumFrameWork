package actionLibrary;

import org.openqa.selenium.support.PageFactory;

import elementRepository.RegisterPage;
import utilityLibrary.DriverUtility;
import utilityLibrary.ReportConfig;
import utilityLibrary.WebElementUtility;

public class RegisterPageLib extends WebElementUtility{
	RegisterPage registerPage = PageFactory.initElements(DriverUtility.wd, RegisterPage.class);
	
	public void registerUser(String firstName,String lastName,String address,String emailAddress,String phone,String skills,String yearBox,String month,String day,String password1,String password2) {
		try{
			enterData(registerPage.getFirstName(),firstName);
			enterData(registerPage.getLastName(),lastName);
		enterData(registerPage.getAddress(),address);
		enterData(registerPage.getEmailAddress(),emailAddress);
		enterData(registerPage.getPhone(),phone);
		click(registerPage.getMale());
		click(registerPage.getHobbies());
		selectText(registerPage.getSkills(),skills);
		click(registerPage.getLanguage());
		click(registerPage.getCroation());
		click(registerPage.getCatalan());
		click(registerPage.getPhone());
		click(registerPage.getSelectCountry());
		click(registerPage.getAutralia());
		click(registerPage.getPhone());
		selectText(registerPage.getYearBox(),yearBox);
		selectText(registerPage.getMonth(),month);
		selectText(registerPage.getDay(),day);
		enterData(registerPage.getFirstPassword(),password1);
		enterData(registerPage.getSecondPassword(),password2);
		ReportConfig.passCase("User entered all required fields for register page", "Registration_Completed");
		}
		catch (Exception e)
		{
			ReportConfig.failCase("User not able to enter all required fields for register page", "Registration_Failed");	
		}
	}
	
	public boolean validateHeaderLoad() {
		return registerPage.getHeader().isDisplayed();
	}
}
