package tech.credify.qa.pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tech.credify.qa.BasePage.BasePage;

public class RegistrationPage  extends BasePage{
	
	//PageFactory
	
	@FindBy(name="borrowerFirstName")
	WebElement firstName;
	
	@FindBy(name="borrowerLastName")
	WebElement lastName;
	
	@FindBy(xpath="//input[@name='borrowerStreet']")
	WebElement homeAddress;
	
	@FindBy(xpath="//input[@name='borrowerCity']")
	WebElement cityName;
	
	@FindBy(xpath = "//input[@name='borrowerState']")
	WebElement stateName;
	
	@FindBy(xpath="//input[@name='borrowerZipCode']")
	WebElement zipCode;
	
	@FindBy(xpath="//input[@name='borrowerDateOfBirth']")
	WebElement DOB;
	
	@FindBy(xpath= "//input[@name='borrowerIncome']")
	WebElement anualIncome;
	
	@FindBy(xpath= "//input[@name='borrowerAdditionalIncome']")
	WebElement addtionalAnualIncome;
	
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement passWord;
	
	@FindBy(xpath= "//div[@class='sc-kPVwWT sc-kfGgVZ ghCrQD']")
	WebElement checkBox;
	
	@FindBy(className= "iKoMvw")
	WebElement RateBtn;
	
	@FindBy(className= "wLhJP")
	WebElement changeLoanAmount;
	
	@FindBy(xpath="//button[@type='submit' and @data-auto='updateAmount']")
	WebElement cyrBtn;
	

	
	
	// intialising pagefactory obj
	
	public RegistrationPage() {
		
		PageFactory.initElements(driver, this);
	}
	// creating new registration method 
	public OfferPage creatingNewAccount(String ftName, String ltName, String hmeAdrs, String ctyName, String stName, String zCode, String dob, String aIncome, String adIncome, String uName, String pswd, String chngLAmount) throws InterruptedException {
		
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		homeAddress.sendKeys(hmeAdrs);
		cityName.sendKeys(ctyName);
		stateName.sendKeys(stName);
		zipCode.sendKeys(zCode);		
		DOB.sendKeys(dob);
		anualIncome.sendKeys(aIncome);
		addtionalAnualIncome.sendKeys(adIncome);
		userName.sendKeys(uName);
		passWord.sendKeys(pswd);
		checkBox.click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", RateBtn);
		
		RateBtn.click();
		changeLoanAmount.sendKeys(chngLAmount);
		cyrBtn.click();
		return new OfferPage();
		
		
		

		
	}
	
	
	
	

}
