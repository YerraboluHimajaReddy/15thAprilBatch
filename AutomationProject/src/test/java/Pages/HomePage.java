package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	/*1st way
	@findBy(How=How.locator, using=”locator value’)
	Public webelement webelementname*/

    @FindBy(how = How.XPATH, using = "//span[@class='oxd-userdropdown-tab']")	
	public WebElement user_Dropdown;
	
	public void clickUserDropdown() {

		user_Dropdown.click();
	}

}
