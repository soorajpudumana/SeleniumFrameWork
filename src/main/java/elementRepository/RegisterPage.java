package elementRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	
@FindBy(xpath="//input[@placeholder ='First Name']")
private WebElement firstName;
@FindBy(xpath="//input[@placeholder ='Last Name']")
private WebElement lastName;
@FindBy(xpath="//textarea[@ng-model='Adress']")
private WebElement address;
@FindBy(xpath="//input[@ng-model='EmailAdress']")
private WebElement emailAddress;
@FindBy(xpath="//input[@ng-model='Phone']")
private WebElement phone;
@FindBy(xpath="//input[@value='Male']")
private WebElement male;
@FindBy(xpath="//input[@value='Cricket']")
private WebElement hobbies;
@FindBy(xpath="//select[@id='Skills']")
private WebElement skills;
@FindBy(xpath="//div[@id='msdd']")
private WebElement language;
@FindBy(xpath="//a[contains(text(),'Croatian')]")
private WebElement croation;
@FindBy(xpath="//a[contains(text(),'Catalan')]")
private WebElement catalan;
@FindBy(xpath="//span[@class='selection']/span")
private WebElement selectCountry;
@FindBy(xpath="//option[contains(text(),'Australia')]")
private WebElement autralia;
@FindBy(xpath="//select[@id='yearbox']")
private WebElement yearBox;
@FindBy(xpath="//select[@placeholder='Month']")
private WebElement month;
@FindBy(xpath="//select[@id='daybox']")
private WebElement day;
@FindBy(xpath="//input[@id='firstpassword']")
private WebElement firstPassword;
@FindBy(xpath="//input[@id='secondpassword']")
private WebElement secondPassword;
@FindBy(xpath="//h2[contains(text(),'Register')]")
private WebElement header;

public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getAddress() {
	return address;
}
public WebElement getEmailAddress() {
	return emailAddress;
}
public WebElement getPhone() {
	return phone;
}
public WebElement getMale() {
	return male;
}
public WebElement getHobbies() {
	return hobbies;
}
public WebElement getSkills() {
	return skills;
}
public WebElement getLanguage() {
	return language;
}
public WebElement getCroation() {
	return croation;
}
public WebElement getCatalan() {
	return catalan;
}
public WebElement getSelectCountry() {
	return selectCountry;
}
public WebElement getAutralia() {
	return autralia;
}
public WebElement getYearBox() {
	return yearBox;
}
public WebElement getMonth() {
	return month;
}
public WebElement getDay() {
	return day;
}
public WebElement getFirstPassword() {
	return firstPassword;
}
public WebElement getSecondPassword() {
	return secondPassword;
	
}
public WebElement getHeader() {
	return header;
}


}
