package BaseOrCommon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CommonMethods {
	
	public WebDriver driver;
	
	public void browserLaunching(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("safari")) {
			
			driver = new SafariDriver();
		}
		else {			
			driver = new FirefoxDriver(); 
		}			
	}
	
	public void browserClosing() {
		
		driver.quit();
	}
	
	public void launchingTheURL(String url) {
		
		driver.get(url);
	}
	
	public void browserMaximization() {
		
		driver.manage().window().maximize();
	}
	
	public void timing() {
				
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	
	
	public void asrithaScreenshot(String screenshotName) throws IOException
	{
		File purabhi = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(purabhi, new File("C:\\Users\\himaj\\eclipse-workspace\\15thApril2024\\AutomationProject\\src\\test\\java\\Screenshots\\"+screenshotName+ ".png") );
	}
}
