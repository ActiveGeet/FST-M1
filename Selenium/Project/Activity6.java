package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
	
	WebDriver driver;
	WebDriverWait wait;
	Boolean result = true;
	Select select;
	
	@BeforeClass
	public void beforeClass() {
		//Open the browser
		driver = new FirefoxDriver();
		System.out.println("Browser Launched");
		Reporter.log("Browser Launched");
	}
	
	@Test
	public void testDirectory() throws InterruptedException {
		//a. Open the OrangeHRM page and login with credentials provided

			String url = "http://alchemy.hguy.co/orangehrm";
			driver.get(url);
			System.out.println("User navigated Login Page: "+url);
			Reporter.log("User navigated to Login Page: "+url);
			
			//Find and select the username and password fields
			WebElement username = driver.findElement(By.id("txtUsername"));
			WebElement password = driver.findElement(By.id("txtPassword"));
			
			//Enter login credentials into the respective fields
			username.sendKeys("orange");
			System.out.println("User enters Username");
			Reporter.log("User enters Username");
			
			password.sendKeys("orangepassword123");
			System.out.println("User enters Password");
			Reporter.log("User enters Password");
			
			//Click login
			WebElement loginButton = driver.findElement(By.id("btnLogin"));
			loginButton.click();
			Thread.sleep(5000);
			System.out.println("User click on the Login Button");
			Reporter.log("User click on the Login Button");
		
		//b. Locate the navigation menu.
			WebElement directory = driver.findElement(By.id("menu_directory_viewDirectory"));
			
		//c. Verify that the “Directory” menu item is visible and clickable.
			
			Boolean elementPresent = directory.isDisplayed();
			Boolean elementenabled = directory.isEnabled();
			
			wait.until(ExpectedConditions.elementToBeClickable(directory));
			
			Assert.assertEquals(elementPresent, result, "Directory is visible in menu options");
			Assert.assertEquals(elementenabled, result, "Directory is enabled to click in menu options");
			System.out.println("Directory is visible and enabled to click in menu options");
			Reporter.log("Directory is visible and enabled to click in menu options");
			
		//d. if clickable, click on the menu item.
			directory.click();
			System.out.println("Directory menu option has been clicked");
			Reporter.log("Directory menu option has been clicked");
			Thread.sleep(5000);
			
		//e. Verify that the heading of the page matches “Search Directory”.
			WebElement searchDirectoryHeading = driver.findElement(By.xpath("//*[contains(@class,'head')]/h1"));
			String text_searchDirectoryHeading = searchDirectoryHeading.getText();
			Assert.assertEquals(text_searchDirectoryHeading, "Search Directory", "The heading of the page matches 'Search Directory'");
			System.out.println("The heading of the page matches 'Search Directory'");
			Reporter.log("The heading of the page matches 'Search Directory'");
			
	}
	
	
	@AfterClass
	public void afterClass() {
		//f. close the browser.
		driver.close();
	}

}
