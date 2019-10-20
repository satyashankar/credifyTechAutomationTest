package tech.credify.qa.Tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tech.credify.qa.BasePage.BasePage;
import tech.credify.qa.pages.OfferPage;
import tech.credify.qa.pages.RegistrationPage;
import tech.credify.qa.pages.landingPage;

public class RegistrationPageTest extends BasePage {
	
	landingPage Landingpage;
	RegistrationPage regPage;
	OfferPage offPage;
	
	
	public RegistrationPageTest() {		
		super();
	}
		
		@BeforeMethod		
		public void setUP() throws InterruptedException{
			initialization();
			offPage = new OfferPage();
			Landingpage = new landingPage();
			
	
		}
		
		@Test
		public void verifyning_RegPage_Test() throws InterruptedException {	
			regPage = Landingpage.CheckingYourRate("2000","Business");					    
			 offPage = regPage.creatingNewAccount("george", "peter","Newbury Street","Boston","MA","02116","02/02/1985","125000","7500","george.peter02@upgrade-challenge.com","Tpeter02","6500");
				Thread.sleep(5000);
			 offPage.signOutFromAccount();
			
			
		}
		
		@AfterMethod
		public void tearDown() {
			driver.close();
		}	
		
		
	}






