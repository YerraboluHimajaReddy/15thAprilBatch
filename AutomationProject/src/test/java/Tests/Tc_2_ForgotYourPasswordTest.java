package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BaseOrCommon.CommonMethods;
import Methods.ForgotYourPasswordMethods;
import Pages.LoginPage;

public class Tc_2_ForgotYourPasswordTest extends CommonMethods {
	
	LoginPage lp;
	
	ForgotYourPasswordMethods fpm;
	
	@BeforeSuite
	public void launchBrowser() {
		
		browserLaunching("chrome");
		
		lp = new LoginPage(driver);
		
		fpm = new ForgotYourPasswordMethods(driver);

		System.out.println("in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() {
		
		launchingTheURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		browserMaximization();

		System.out.println("in @BeforeClass method");
	}
	
	@BeforeMethod
	public void waitingTime() {
		
		timing();
		
		System.out.println("in @BeforeMethod method");
	}
		
	@Test (priority = 1)
	public void verifyForgotYourPasswordLink() {
		
		lp.verifyForgotYourPassword();
		
		System.out.println("in @test verifyLogo method");
	}
	

	@Test (priority = 2)
	public void clickForgotYourPassword() {
		
		lp.clickForgotYourPassword();
		
		System.out.println("in @test verifyLogo method");
	}

	
	@Test(priority = 3)
	public void verifyUsernameAndEnter() {
		
		fpm.enterUsername();
		
		System.out.println("in @test verifyUsernameAndEnter method");
	}
	
	@Test(priority = 4)
	public void clickCancel() {
		
		fpm.clickCancel();
		
		System.out.println("in @test clickCancel method");
	}
		
	@AfterMethod
	public void waitingTime1() {
		
		timing();
		
		System.out.println("in @AfterMethod method");
	}

	@AfterSuite
	public void closeBrowser() {

		browserClosing();
		
		System.out.println("in @AfterSuite method");
	}

}
