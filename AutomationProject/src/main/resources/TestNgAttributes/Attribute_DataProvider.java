package TestNgAttributes;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseOrCommon.CommonMethods;

public class Attribute_DataProvider extends CommonMethods{

	@BeforeSuite
	public void launchBrowser() {
		
		browserLaunching("chrome");

		System.out.println("in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() {
		
		launchingTheURL("https://www.facebook.com/");

		browserMaximization();

		System.out.println("in @BeforeClass method");
	}
	
	@BeforeMethod
	public void waitingTime() {
		
		timing();
		
		System.out.println("in @BeforeMethod method");
	}
	
	@DataProvider(name = "purabhi")
	public Object[][] addCredentails(){
		
		Object[][] values = new Object[3][2];
		
		values[0][0] ="sai";		
		values[0][1] ="sai123";
		
		values[1][0] ="santhoshi";		
		values[1][1] ="santhoshi456";
		
		values[2][0] ="Preethi";		
		values[2][1] ="preethi897";
		
		return values;
		
	}
	
	@Test (dataProvider = "purabhi")
	public void verifyCredentials(String username, String password) {
		
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);	
		
		driver.findElement(By.xpath("//input[@name='pass']")).clear();
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		
		System.out.println("in @test verifyCredentials method");
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
