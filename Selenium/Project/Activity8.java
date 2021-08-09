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

public class Activity8 {
	
	WebDriver driver;
	Boolean result = true;
	Select select;
	String fdate = "2021-08-06";
	String tdate = "2021-08-06";
	
	@BeforeClass
	public void beforeClass() {
		//Open the browser
		driver = new FirefoxDriver();
		System.out.println("Browser Launched");
		Reporter.log("Browser Launched");
	}
	
	@Test
	public void testLeaveApplication() throws InterruptedException {
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
		
		//b. Navigate to the Dashboard page and click on the Apply Leave option.
			WebElement dashboard = driver.findElement(By.linkText("Dashboard"));
			dashboard.click();
			Thread.sleep(2000);
			System.out.println("'Dashboard' option from Menu has been clicked.");
			Reporter.log("'Dashboard' option from Menu has been clicked.");

			WebElement applyLeave = driver.findElement(By.xpath("//*[contains(text(),'Apply Leave')]"));
			applyLeave.click();
			Thread.sleep(5000);
			
		//c. Select leave type and duration of the leave.
			WebElement leaveType = driver.findElement(By.id("applyleave_txtLeaveType"));
			select = new Select(leaveType);
			select.selectByVisibleText("privilege leaves");
			
			
			WebElement fromDate = driver.findElement(By.id("applyleave_txtFromDate"));
			fromDate.clear();
			fromDate.sendKeys(fdate);
			
			WebElement toDate = driver.findElement(By.id("applyleave_txtToDate"));
			toDate.clear();
			toDate.sendKeys(tdate);
			
			
			 WebElement applyButton = driver.findElement(By.id("applyBtn"));
			 applyButton.click();
			 System.out.println("Apply Leave button has been clicked");
			 Reporter.log("Apply Leave button has been clicked"); 
			 Thread.sleep(5000);
			 
			
		//d. Navigate to the My Leave page to check the status of the leave application.
			WebElement myLeaveList = driver.findElement(By.id("menu_leave_viewMyLeaveList"));
			myLeaveList.click();
			Thread.sleep(5000);
			System.out.println("Navigate to Page 'My Leave'");
			Reporter.log("Navigate to Page 'My Leave'");
			
			//WebElement tableLeave = driver.findElement(By.xpath("//tbody//tr//td[1]/a[contains(text(),'"+fdate+" to "+tdate+"')]/parent::td/following-sibling::td[5]"));
			WebElement tableLeave = driver.findElement(By.xpath("//tbody//tr//td[1]/a[contains(text(),'"+fdate+"')]/parent::td/following-sibling::td[5]"));
			String leaveStatus = tableLeave.getText();
			System.out.println("Status of the leave application: "+leaveStatus);
			Reporter.log("Status of the leave application: "+leaveStatus);
	}
	
	@AfterClass
	public void afterClass() {
		//f. close the browser.
		driver.close();
	}

}
