package TestNgAssertions;

import static org.testng.Assert.assertEquals;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BaseOrCommon.CommonMethods;

public class HardAssertion2 extends CommonMethods{

	@BeforeSuite
	public void launchBrowser() throws IOException {
		
		browserLaunching("chrome");

		System.out.println("in @BeforeSuite method");
		
		asrithaScreenshot("launchBrowser");
	}

	@BeforeClass
	public void launchURL() throws IOException {
		
		browserMaximization();

		launchingTheURL("https://www.meesho.com/");

		System.out.println("in @BeforeClass method");
		
		asrithaScreenshot("launchURL");
	}
	
	@BeforeMethod
	public void waitingTime() {
		
		timing();
		
		System.out.println("in @BeforeMethod method");
	}
	
	@Test(priority =  1)
	public void verifyTitle() throws IOException {
		
		String expectedTitle = "Online Shopping Site for Fashion, Electronics, Home & More | Meesho";
		
		String actualTitle = driver.getTitle();
		
		assertEquals(expectedTitle, actualTitle);
		
		System.out.println("Both titles are same");
		
		System.out.println("in @test verifyTitle method");
		
		asrithaScreenshot("Meesho HomePasge");

	}
	
	@Test(priority =  2)
	public void verifyWomenEthincTab() throws IOException {
		
		driver.findElement(By.xpath("//span[text()='Women Ethnic']")).click();
		
		System.out.println("in @test verifyWomenEthincTab method");
		
		asrithaScreenshot("verifyWomenEthincTab");
	}
	
	@AfterMethod
	public void waitingTime1() {
		
		timing();
		
		System.out.println("in @AfterMethod method");
	}

	@AfterSuite
	public void closeBrowser() throws IOException {
		
		asrithaScreenshot("closeBrowser");

		browserClosing();
		
		System.out.println("in @AfterSuite method");
	}
}
