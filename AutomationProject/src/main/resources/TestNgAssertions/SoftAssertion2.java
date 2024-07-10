package TestNgAssertions;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseOrCommon.CommonMethods;

public class SoftAssertion2 extends CommonMethods{

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
		
		String expectedTitle = "Sai Nakka";
		
		String actualTitle = driver.getTitle();
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(expectedTitle, actualTitle);
				
		System.out.println("in @test verifyTitle method");
		
		sa.assertAll("test method got failed due to titles are not same");
	}
		
	@Test(priority =  2)
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
