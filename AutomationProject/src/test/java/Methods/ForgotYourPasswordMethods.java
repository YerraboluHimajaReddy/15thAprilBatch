package Methods;

import org.openqa.selenium.WebDriver;

import Pages.ForgotYourPasswordPage;

public class ForgotYourPasswordMethods {

	public WebDriver driver;

	public ForgotYourPasswordMethods(WebDriver driver) {

		this.driver = driver;
	}
	
	ForgotYourPasswordPage fpm = new ForgotYourPasswordPage(driver);

	public void enterUsername() {

		driver.findElement(fpm.username_Textbox).sendKeys("Santhoshi");
	}
	
	public void clickResetPassword() {

		driver.findElement(fpm.resetPassword_Button).click();
	}
	
	public void clickCancel() {

		driver.findElement(fpm.cancel_Button).click();
	}

}
