package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity9 {
	
	WebDriver driver;
	Boolean result = true;
	
	@BeforeClass
	public void beforeClass() {
		//Open the browser
		driver = new FirefoxDriver();
		System.out.println("Browser Launched");
		Reporter.log("Browser Launched");
	}
	
	@Test
	public void testEmergencyContacts() throws InterruptedException {
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
		
			
		//c. On the new page, find the Emergency Contacts option on the left side menu and click it
			WebElement emergencyContacts = driver.findElement(By.xpath("//div[@id='sidebar']//a[contains(text(),'Emergency Contacts')]"));
			emergencyContacts.click();
			System.out.println("'Emergency Contacts' option on the left side menu has been clicked");
			Reporter.log("'Emergency Contacts' option on the left side menu has been clicked");
			Thread.sleep(5000);
			
		//e. Retrieve information about all the contacts listed in the table.
		//f. Print all the information to the console.

	    	WebElement mytable = driver.findElement(By.xpath("//table[@id='emgcontact_list']//tbody"));
	    	List < WebElement > rows = mytable.findElements(By.tagName("tr"));
	    	int row_count = rows.size();
	        System.out.println("No of rows are : " +row_count );
	        
	    	for (int row = 0; row < row_count; row++) {
	    		List < WebElement > column = rows.get(row).findElements(By.tagName("td"));
	    		int column_count = column.size();
		        System.out.println("No of columns are : " +column_count); 
		        
		        for (int col = 0; col < column_count; col++) {
		        	String cellText = column.get(col).getText();
		        	System.out.println("Cell Value of row number " + row + " and column number " + col + " is: " + cellText);
		        }
	    	}
			Thread.sleep(5000);
	}
	
	@AfterClass
	public void afterClass() {
		//g. close the browser.
		driver.close();
	}
}
