package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
	
	WebDriver driver;
	Actions action; 
	Boolean result = true;
	Select select;
	String fname = "Jeevan";
	String lname = "Kishore";
	
	@BeforeClass
	public void beforeClass() {
		//Open the browser
		driver = new FirefoxDriver();
		System.out.println("Browser Launched");
		Reporter.log("Browser Launched");
		
		action= new Actions(driver);
	}
	
	@Test
	public void testEditUserInfo() throws InterruptedException {
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
			
		//c. Click the Edit button to update my infomation
			WebElement editButton = driver.findElement(By.xpath("//*[contains(@value,'Edit')]"));
			editButton.click();
			System.out.println("Edit button has been clicked to update my infomation");
			Reporter.log("Edit button has been clicked to update my infomation");
			
		//d. Fill in the required fields and click Save.
			WebElement firstName = driver.findElement(By.id("personal_txtEmpFirstName"));
			firstName.clear();
			firstName.sendKeys(fname);
			
			WebElement lastName = driver.findElement(By.id("personal_txtEmpLastName"));
			lastName.clear();
			lastName.sendKeys(lname);
			
			WebElement radioGender = driver.findElement(By.id("personal_optGender_1"));
			radioGender.click();
			
			WebElement nationality = driver.findElement(By.id("personal_cmbNation"));
			select = new Select(nationality);
			select.selectByVisibleText("Indian");
			
			WebElement dob = driver.findElement(By.id("personal_DOB"));
			dob.clear();
			dob.sendKeys("1985-01-01");
			
			WebElement saveButton = driver.findElement(By.id("btnSave"));
			saveButton.click();
			Reporter.log("Save button has been clicked.");
			System.out.println("Save button has been clicked.");
	}
	
	
	@AfterClass
	public void afterClass() {
		//e. close the browser.
		driver.close();
	}

}
