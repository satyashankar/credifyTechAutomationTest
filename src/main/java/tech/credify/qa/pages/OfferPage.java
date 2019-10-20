package tech.credify.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tech.credify.qa.BasePage.BasePage;

public class OfferPage extends BasePage{
	
	//PageFactory	
	
	@FindBy(className="header-nav__toggle")
	WebElement menuIcon;	
	
	@FindBy(xpath="//a[contains(text(),'Sign Out')]")
	WebElement signOutBtn;
	
	@FindBy(xpath="//span[@data-auto='userLoanAmount']")
	WebElement loanAmount;
	
	@FindBy(xpath="//*[@data-auto='defaultMonthlyPayment']")
	WebElement monthlyPayment;
	
	@FindBy(xpath="//div[@class='section--xs' and @data-auto='defaultLoanTerm']")
	WebElement loanTerm;
	
	@FindBy(xpath="//div[ @data-auto='defaultMoreInfoAPR']")
	WebElement aprAmount;
	

	
	//intialising pageFactory
	
	public OfferPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	// create sign out from application method
	
	public void signOutFromAccount() {	
		try {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.elementToBeClickable(menuIcon));
		menuIcon.click();		
		WebDriverWait waitSignOut = new WebDriverWait(driver,40);		
	    waitSignOut.until(ExpectedConditions.elementToBeClickable(signOutBtn));
		signOutBtn.click();
		}catch(Exception e) {
			
		}
	}
	
	// creating loan amount method	
	public String validatingLoanAmount() {
	  String expectedLoanAmount = loanAmount.getText();
	return expectedLoanAmount;
	}
	// creating monthly payment method
	public String validatingMonthlyPayment() {
		String expectedMonthlyPayment= monthlyPayment.getText();
		return expectedMonthlyPayment;
		
	}
	// creating loan term method
	public String validatindLoanTerm() {
	 String expectedLoanTerm = loanTerm.getText();
	return expectedLoanTerm;
	}
	// APR amount  method
	public String validatingAPRAmount() {
	String expectedAPRAmount = aprAmount.getText();
	return expectedAPRAmount;
	}
	
	
	
	

}
