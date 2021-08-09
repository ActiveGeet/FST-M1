package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
	
	WebDriver driver;
	Actions action; 
	Boolean result = true;
	String fname = "Test"; 
	String lname = "3";
	
	@BeforeClass
	public void beforeClass() {
		//Open the browser
		driver = new FirefoxDriver();
		System.out.println("Browser Launched");
		Reporter.log("Browser Launched");
		
		action= new Actions(driver);
	}
	
	@Test
	public void testAddEmployee() throws InterruptedException {
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
		
		//b. Find the PIM option in the menu and click it.
			WebElement pim = driver.findElement(By.linkText("PIM"));
			pim.click();
			//pim.click();
			Thread.sleep(2000);
			System.out.println("PIM option from Menu has been clicked.");
			Reporter.log("PIM option from Menu has been clicked.");
			
		//c. Click the Add button to add a new Employee
			WebElement addButton = driver.findElement(By.id("btnAdd"));
			addButton.click();
			System.out.println("Add button has been clicked to add a new Employee");
			Reporter.log("Add button has been clicked to add a new Employee");
			
		//d. Fill in the required fields and click Save.
			WebElement firstName = driver.findElement(By.id("firstName"));
			firstName.sendKeys(fname);
			
			WebElement lastName = driver.findElement(By.id("lastName"));
			lastName.sendKeys(lname);
			
			WebElement saveButton = driver.findElement(By.id("btnSave"));
			saveButton.click();
			System.out.println("Save button has been clicked.");
			Reporter.log("Save button has been clicked.");
			
		//e. Navigate back to the PIM page (Employee List tab) and verify the creation of your employee.
			Thread.sleep(1000);
			WebElement employeeList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
			employeeList.click();
			System.out.println("Navigate back to PIM Page 'Employee List'");
			Reporter.log("Navigate back to PIM Page 'Employee List'");
			
			WebElement tableEmployee = driver.findElement(By.xpath("//tbody//tr//td[3]/a[contains(text(),"+fname+")]/parent::td/following-sibling::td/a[contains(text(),"+lname+")]"));
			Boolean elementPresent;
			/*
			 * elementPresent = tableEmployee.isDisplayed();
			 * Assert.assertEquals(elementPresent, result,
			 * "Verified the created employee in Employee List");
			 * System.out.println("Verified the created employee in Employee List: "
			 * +elementPresent);
			 */
			
			WebElement employeeName = driver.findElement(By.id("empsearch_employee_name_empName"));
			employeeName.sendKeys(fname+" "+lname);
			WebElement searchButton = driver.findElement(By.id("searchBtn"));
			searchButton.click();
			Thread.sleep(1000);
			System.out.println("Search button has been clicked.");
			Reporter.log("Search button has been clicked.");
			elementPresent = tableEmployee.isDisplayed();
			Assert.assertEquals(elementPresent, result, "Verified the created employee using Search functionality");
			System.out.println("Verified the created employee using Search functionality: "+elementPresent);
			
			
			
			
	}
	
	
	@AfterClass
	public void afterClass() {
		//e. close the browser.
		driver.close();
	}

}
