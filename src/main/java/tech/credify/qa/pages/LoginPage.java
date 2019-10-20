package tech.credify.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tech.credify.qa.BasePage.BasePage;

public class LoginPage extends BasePage{
	
	//PageFactory Obj Repository
	
	@FindBy(xpath="//input[@name='username']")
	WebElement userID;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement userPsswd;
	
	@FindBy(className="ibAgVm")
	WebElement signInBtn;
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		driver.navigate().to(prop.getProperty("loginurl"));
	}
	
	// create login in to application method
	
	public void loginIntoApp(String uID, String uPswd) {		
		userID.sendKeys(uID);
		userPsswd.sendKeys(uPswd);
		signInBtn.click();	
		}
	

}
