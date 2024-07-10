package TestNgAssertions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BaseOrCommon.CommonMethods;

public class HardAssertion extends CommonMethods{

	@BeforeSuite
	public void launchBrowser() {
		
		browserLaunching("chrome");

		System.out.println("in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() {
		
		launchingTheURL("https://www.meesho.com/");

		browserMaximization();

		System.out.println("in @BeforeClass method");
	}
	
	@BeforeMethod
	public void waitingTime() {
		
		timing();
		
		System.out.println("in @BeforeMethod method");
	}
	
	@Test(priority =  1)
	public void verifyTitle() {
		
		String expectedTitle = "Online Shopping Site for Fashion, Electronics, Home & More | Meesho";
		
		String actualTitle = driver.getTitle();
		
		assertEquals(expectedTitle, actualTitle);
		
		System.out.println("Both titles are same");
		
		System.out.println("in @test verifyTitle method");
	}
	
	@Test(priority =  2)
	public void verifyTitle1() {
		
		String expectedTitle = "Purabhi";
		
		String actualTitle = driver.getTitle();
		
		assertEquals(expectedTitle, actualTitle);
		
		System.out.println("Both titles are same");
		
		System.out.println("in @test verifyTitle1 method");
	}
	
	@Test(priority =  3)
	public void verifyWomenEthincTab() {
		
		driver.findElement(By.xpath("//span[text()='Women Ethnic']")).click();
		
		System.out.println("in @test verifyWomenEthincTab method");
	}
	
	@AfterMethod
	public void waitingTime1() {
		
		timing();
		
		System.out.println("in @AfterMethod method");
	}

	@AfterSuite
	public void closeBrowser() {

		//browserClosing();
		
		System.out.println("in @AfterSuite method");
	}
}
