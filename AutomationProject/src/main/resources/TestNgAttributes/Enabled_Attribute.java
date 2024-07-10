package TestNgAttributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Enabled_Attribute {

	public WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {

		driver = new ChromeDriver();

		System.out.println("in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() {

		driver.get("https://www.jazzpharma.com/");
		
		driver.manage().window().maximize();

		System.out.println("in @BeforeClass method");
	}
	
	@BeforeMethod
	public void waitingTime() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		System.out.println("in @BeforeMethod method");
	}
	
	@Test (priority = 1)
	public void verifyMedicinesTab() {
		
		WebElement medicinesTab = driver.findElement(By.xpath("//a[text()='Medicines']"));
		
		if(medicinesTab.isDisplayed()) {
			
			System.out.println("medicinesTab is displayed");
		}
		else {
			
			System.out.println("medicinesTab is not displayed");
		}
		
		System.out.println("in @test verifyMedicinesTab method");
	}
	
	@Test(priority = 2)
	public void clickMedicinesTab() {
		
		WebElement medicinesTab = driver.findElement(By.xpath("//a[text()='Medicines']"));

		medicinesTab.click();
		
		System.out.println("in @test ClickMedicinesTab method");
	}
	
	@Test(priority = 3, enabled = false  )
	public void verifyMedicalInformationUs() {
		
		WebElement medicalInformationUs= driver.findElement(By.xpath("//a[text()='Medical Information US']"));
		
		if(medicalInformationUs.isDisplayed()) {
			
			System.out.println("medicalInformationUs link is displayed");
		}
		else {
			
			System.out.println("medicalInformationUs link is not displayed");
		}
		
		System.out.println("in @test verifyMmedicalInformationUs method");
	}
		
	@Test(priority = 4)
	public void verifyMedicinesHeaderText() {
		
		String expectedText = "Medicines";
		
		String actualText= driver.findElement(By.xpath("//div[contains(@class,'page-title')]/h1")).getText();
		
		if(expectedText.equals(actualText)) {
			
			System.out.println( expectedText + "is displayed");
		}
		else {
			
			System.out.println( expectedText + "is displayed");
		}
		
		System.out.println("in @test verifyMedicinesHeaderText method");
	}
	
	@AfterMethod
	public void waitingTime1() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		System.out.println("in @AfterMethod method");
	}

	@AfterSuite
	public void closeBrowser() {

		driver.quit();

		System.out.println("in @AfterSuite method");
	}

}
