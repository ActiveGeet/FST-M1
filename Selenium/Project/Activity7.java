package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
	
	WebDriver driver;
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
	public void testAddQualification() throws InterruptedException {
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
		
		//b. Find the My Info option in the menu and click it.
			WebElement myInfo = driver.findElement(By.linkText("My Info"));
			myInfo.click();
			Thread.sleep(2000);
			System.out.println("'My Info' option from Menu has been clicked.");
			Reporter.log("'My Info' option from Menu has been clicked.");
		
			
		//c. On the new page, find the Qualification option on the left side menu and click it
			WebElement qualifications = driver.findElement(By.xpath("//div[@id='sidebar']//a[contains(text(),'Qualifications')]"));
			qualifications.click();
			System.out.println("Qualification option on the left side menu has been clicked");
			Reporter.log("Qualification option on the left side menu has been clicked");
			Thread.sleep(5000);
			
		//d. Add Work Experience and click Save.
			WebElement addExpButton = driver.findElement(By.id("addWorkExperience"));
			addExpButton.click();
			System.out.println("Add Work Experience button has been clicked");
			Reporter.log("Add Work Experience button has been clicked");
			Thread.sleep(5000);
			
			WebElement companyName = driver.findElement(By.id("experience_employer"));
			companyName.sendKeys("IBM");
			
			WebElement jobTitle = driver.findElement(By.id("experience_jobtitle"));
			jobTitle.sendKeys("Automation Test Specialist");
			
			WebElement addSaveExpButton = driver.findElement(By.id("btnWorkExpSave"));
			addSaveExpButton.click();
			System.out.println("Save Work Experience button has been clicked");
			Reporter.log("Save Work Experience button has been clicked");
			Thread.sleep(5000);
	}
	
	@AfterClass
	public void afterClass() {
		//f. close the browser.
		driver.close();
	}

}
