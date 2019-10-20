package tech.credify.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tech.credify.qa.BasePage.BasePage;

public class landingPage extends BasePage{
	
	//PageFactory 
	
	@FindBy(xpath="//input[@name='desiredAmount']")
	WebElement loanAmount; 
	
	@FindBy(xpath="//select[@class='sc-dVhcbM iHtznt']")
	WebElement loanPurpose;
	
	@FindBy(xpath= "//button[@type='submit']")
	WebElement checkYourRateBtn;
	
	
	
	
	
	// Intialising PageFactory
	
	public landingPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//  creating method entering loan amount and loan purpose
	public RegistrationPage CheckingYourRate(String Lamount, String lPurpose) {
		loanAmount.sendKeys(Lamount);
		Select selectLoanPurpose = new Select(loanPurpose);
		selectLoanPurpose.selectByVisibleText(lPurpose);
		checkYourRateBtn.click();
	 return new RegistrationPage();
		
	}

	

}
