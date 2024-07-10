package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BaseOrCommon.CommonMethods;
import Pages.LoginPage;

public class Tc_1_LoginTest extends CommonMethods {
	
	LoginPage lp;
	
	@BeforeSuite
	public void launchBrowser() {
		
		browserLaunching("chrome");
		
		lp = new LoginPage(driver);

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
	public void verifyLogo() {
		
		lp.verifyLogo();
		
		System.out.println("in @test verifyLogo method");
	}
	
	@Test (priority = 2)
	public void verifyForgotYourPasswordLink() {
		
		lp.verifyForgotYourPassword();
		
		System.out.println("in @test verifyLogo method");
	}
	
	@Test(priority = 3)
	public void verifyUsernameAndEnter() {
		
		lp.enterUsername();
		
		System.out.println("in @test verifyUsernameAndEnter method");
	}
	
	@Test(priority = 4)
	public void verifyPasswordAndEnter() {
		
		lp.enterPassword();
		
		System.out.println("in @test verifyPasswordAndEnter method");
	}
	
	@Test(priority = 5)
	public void clickLoginButton() {
		
		lp.clickLogin();
		
		System.out.println("in @test clickLoginButton method");
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
