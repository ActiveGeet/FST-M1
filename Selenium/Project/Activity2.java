package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		//a. Open a browser.
		driver = new FirefoxDriver();
		System.out.println("Browser Launched");
		Reporter.log("Browser Launched");
	}
	
	@Test
	public void testUrlHeaderImg() {
		//b. Navigate to ‘http://alchemy.hguy.co/orangehrm’.
		String url = "http://alchemy.hguy.co/orangehrm";
		driver.get(url);
		System.out.println("User navigated to URL: "+url);
		Reporter.log("User navigated to URL: "+url);
		
		//c. Get the url of the header image.
		WebElement headerImg = driver.findElement(By.xpath("//*[@id='divLogo']/img"));
		String urlHeaderImg = headerImg.getAttribute("src");
		
		
		//d. Print the url to the console.
		System.out.println("URL of Header Image: "+urlHeaderImg);
		Reporter.log("URL of Header Image: "+urlHeaderImg);
		
	}
	
	
	@AfterClass
	public void afterClass() {
		//e. close the browser.
		driver.close();
	}

}
