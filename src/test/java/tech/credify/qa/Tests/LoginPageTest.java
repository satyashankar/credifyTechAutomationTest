package tech.credify.qa.Tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tech.credify.qa.BasePage.BasePage;
import tech.credify.qa.pages.LoginPage;
import tech.credify.qa.pages.OfferPage;
import tech.credify.qa.pages.RegistrationPage;
import tech.credify.qa.pages.landingPage;

public class LoginPageTest extends BasePage {
	LoginPage loginPage;
	landingPage Landingpage;
	RegistrationPage regPage;
	OfferPage offPage;
	
	public LoginPageTest() {
		super();		
	}
	
	@BeforeMethod
	public void setUP() {
		initialization();
		loginPage = new LoginPage();
		
	
	}
	
	@Test
	// signing in to application using userName and password created in registration page
	public void Sign_Into_App_Test() {
		loginPage.loginIntoApp("george.peter02@upgrade-challenge.com", "Tpeter02");
	}
	
		
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	

}
