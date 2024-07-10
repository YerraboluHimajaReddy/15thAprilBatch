package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignoutPage {

	public WebDriver driver;

	public SignoutPage(WebDriver driver) {

		this.driver = driver;
	}

	/*//2nd way
@findBy(locator=”locator valu)
Public webelement webelementname
*/

    @FindBy(xpath = "//a[text()='About']")	
	public WebElement about_Button;
    
    @FindBy(xpath = "//a[text()='Support']")	
  	public WebElement support_Button;
    
    @FindBy(xpath = "//a[text()='Change Password']")	
  	public WebElement changePassword_Button;
    
    @FindBy(xpath = "//a[text()='Logout']")	
  	public WebElement logout_Button;
  	
  	public void clickLogout() {

  		logout_Button.click();
  	}
  	
  	public void clickChangePasswordAbout() {

  		changePassword_Button.click();
  	}
  	
  	public void clickSupport() {

  		support_Button.click();
  	}
	
	public void clickAbout() {

		about_Button.click();
	}

}
