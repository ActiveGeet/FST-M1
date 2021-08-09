package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		//a. Open the browser
		driver = new FirefoxDriver();
		System.out.println("Browser Launched");
		Reporter.log("Browser Launched");
		
	}
	
	@Test
	public void testLogin() {
		//Navigate to login page ‘http://alchemy.hguy.co/orangehrm’.
		String url = "http://alchemy.hguy.co/orangehrm";
		driver.get(url);
		System.out.println("User navigated Login Page: "+url);
		Reporter.log("User navigated to Login Page: "+url);
		
		
		
		//b. Find and select the username and password fields
		WebElement username = driver.findElement(By.id("txtUsername"));
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		
		//c. Enter login credentials into the respective fields
		username.sendKeys("orange");
		System.out.println("User enters Username");
		Reporter.log("User enters Username");
		
		password.sendKeys("orangepassword123");
		System.out.println("User enters Password");
		Reporter.log("User enters Password");
		
		//d. Click login
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();
		System.out.println("User click on the Login Button");
		Reporter.log("User click on the Login Button");
		
		//e. Verify that the homepage has opened.
		Boolean result = true;
		WebElement welcome = driver.findElement(By.id("welcome"));
		Boolean elementPresent = welcome.isDisplayed();
		Assert.assertEquals(elementPresent, result, "User landed on Home Page.");
		System.out.println("User landed on Home Page: "+elementPresent);
		Reporter.log("User landed on Home Page: "+elementPresent);
	}
	
	
	@AfterClass
	public void afterClass() {
		//e. close the browser.
		driver.close();
	}

}
