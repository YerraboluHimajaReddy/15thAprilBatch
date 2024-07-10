package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BaseOrCommon.CommonMethods;

public class TC_1_UsingBaseClass extends CommonMethods{

	@BeforeSuite
	public void launchBrowser() {
		
		browserLaunching("edge");

		System.out.println("in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() {
		
		launchingTheURL("https://www.jazzpharma.com/");

		browserMaximization();

		System.out.println("in @BeforeClass method");
	}
	
	@BeforeMethod
	public void waitingTime() {
		
		timing();
		
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
	
	@Test(priority = 3)
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
		
		timing();
		
		System.out.println("in @AfterMethod method");
	}

	@AfterSuite
	public void closeBrowser() {

		browserClosing();
		
		System.out.println("in @AfterSuite method");
	}

}
