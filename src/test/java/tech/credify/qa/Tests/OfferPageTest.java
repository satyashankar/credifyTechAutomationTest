package tech.credify.qa.Tests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tech.credify.qa.BasePage.BasePage;
import tech.credify.qa.pages.LoginPage;
import tech.credify.qa.pages.OfferPage;
import tech.credify.qa.pages.RegistrationPage;
import tech.credify.qa.pages.landingPage;

public class OfferPageTest extends BasePage{
	
	landingPage Landingpage;
	RegistrationPage regPage;
	OfferPage offPage;
	LoginPage loginPage;
	
	public OfferPageTest() {		
		super();
	}
	
	   @BeforeMethod		
		public void setUP() throws InterruptedException{
			initialization();
			offPage = new OfferPage();
			Landingpage = new landingPage();
			
	   }
	  
	   @Test(priority=1)	   
	   // storing expected loan amount from offer page before sign out from the application
	   public void Validationg_Loan_Amount_Test() throws InterruptedException {
		   regPage = Landingpage.CheckingYourRate("2000","Business");
		   offPage = regPage.creatingNewAccount("george", "peter","Newbury Street","Boston","MA","02116","02/02/1985","125000","7500","george.peter02@upgrade-challenge.com","Tpeter02","6500");
		   String expectedLoanAmount = offPage.validatingLoanAmount();
		   System.out.println("ExpectedLoanamount...>"+expectedLoanAmount);
		   //Thread.sleep(5000);
		    offPage.signOutFromAccount();		    
		    // string the Actual loan amount after signing into application
		   loginPage = new LoginPage();
		   loginPage.loginIntoApp("george.peter02@upgrade-challenge.com", "Tpeter02");					
			String actualLoanAmount = offPage.validatingLoanAmount();			
			// Validating loan amount
			Assert.assertEquals(actualLoanAmount, expectedLoanAmount, "Loan Amount is not matched" );
			System.out.println("ActualLoanAmount..>"+actualLoanAmount);
	   }
	   @Test(priority=2)
	   // storing expected monthly payment from offer page before sign out from the application
	   public void Validationg_Monthly_Pay_Test() throws InterruptedException {
		   regPage = Landingpage.CheckingYourRate("2000","Business");
		   offPage = regPage.creatingNewAccount("george", "peter","Newbury Street","Boston","MA","02116","02/02/1985","125000","7500","george.peter02@upgrade-challenge.com","Tpeter02","6500");
		   String expectedMonthlyPayment = offPage.validatingMonthlyPayment();
		   System.out.println("ExpectedMonthlyPayment..>"+expectedMonthlyPayment);	
		   //Thread.sleep(5000);
		    offPage.signOutFromAccount();		    
		    // string the Actual loan amount after signing into application
		   loginPage = new LoginPage();
		   loginPage.loginIntoApp("george.peter02@upgrade-challenge.com", "Tpeter02");					
			String actualMonthlyPayment = offPage.validatingMonthlyPayment();
			// Validating monthly payment
			Assert.assertEquals(actualMonthlyPayment, expectedMonthlyPayment, "Loan Amount is not matched" );
			System.out.println("ActaualMonthlyPayment...>"+actualMonthlyPayment);
	   }
	   @Test(priority=3)
	// storing expected loan term from offer page before sign out from the application
	   public void Validationg_Loan_Term_Test() throws InterruptedException {
		   regPage = Landingpage.CheckingYourRate("2000","Business");
		   offPage = regPage.creatingNewAccount("george", "peter","Newbury Street","Boston","MA","02116","02/02/1985","125000","7500","george.peter02@upgrade-challenge.com","Tpeter02","6500");
		   String expectedLoanTerm = offPage.validatindLoanTerm();
		   System.out.println("ExpectedLoanTerm...>"+expectedLoanTerm);
		   //Thread.sleep(5000);
		    offPage.signOutFromAccount();		   
		    // storing the Actual loan term after signing into application
		   loginPage = new LoginPage();
		   loginPage.loginIntoApp("george.peter02@upgrade-challenge.com", "Tpeter02");					
			String actualLoanTerm = offPage.validatindLoanTerm();	
			// Validating loan term
			Assert.assertEquals(actualLoanTerm, expectedLoanTerm, "Loan Amount is not matched" );
			System.out.println("ActualLoanTerm...>"+actualLoanTerm);
	   }
	   @Test(priority=4)
	// storing expected APR amount from offer page before sign out from the application
	   public void Validationg_APR_Amount_Test() throws InterruptedException {
		   regPage = Landingpage.CheckingYourRate("2000","Business");
		   offPage = regPage.creatingNewAccount("george", "peter","Newbury Street","Boston","MA","02116","02/02/1985","125000","7500","george.peter02@upgrade-challenge.com","Tpeter02","6500");
		   String expectedAPRAmount = offPage.validatingAPRAmount();
		   System.out.println("ExpectedAPRamount..>"+expectedAPRAmount);
		   //Thread.sleep(5000);
		    offPage.signOutFromAccount();		   
		 // storing the Actual loan term after signing into application
		   loginPage = new LoginPage();
		   loginPage.loginIntoApp("george.peter02@upgrade-challenge.com", "Tpeter02");					
			String actualAPRAmount = offPage.validatingAPRAmount();
			// Validating loan term
			Assert.assertEquals(actualAPRAmount, expectedAPRAmount, "Loan Amount is not matched" );
			System.out.println("ActualAPRamount..>"+actualAPRAmount);
	   }
	   
	   @AfterMethod
	   public void tearDown() {
		   driver.close();    
		   
		   
		   
		   
	 }
			
			
			

		
}
