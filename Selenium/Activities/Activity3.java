package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException{
		// Create a WebDriver instance, named driver, with the FirefoxDriver().
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		//Open a browser with https://training-support.net/selenium/simple-form
		driver.get("https://training-support.net/selenium/simple-form");
		
		//Get the title of the page using driver.getTitle() and print out the title.
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: "+pageTitle);
		
		//Use findElement() with name() to find the text fields - firstname and lastname.
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		
		//Use WebElement.sendKeys() to type in those text fields.
		firstName.sendKeys("Santa");
		System.out.println("'Santa' has been entered in First Name textbox.");
		Thread.sleep(1000);
		
		lastName.sendKeys("Cruz");
		System.out.println("'Cruz' has been entered in Last Name textbox.");
		Thread.sleep(1000);
		
		//Similarly, find and type into the email and contact number fields.
		WebElement email = driver.findElement(By.id("email"));
		WebElement contactNo = driver.findElement(By.id("number"));
		
		email.sendKeys("test@gmail.com");
		System.out.println("'test@gmail.com' has been entered in Email textbox.");
		Thread.sleep(1000);
		
		contactNo.sendKeys("9876543210");
		System.out.println("'9876543210' has been entered in Contact Number textbox.");
		Thread.sleep(1000);
		
		//submit the form by clicking the Submit button.
		WebElement submitBtn = driver.findElement(By.xpath("//*[contains(@value,'submit')]"));
		submitBtn.click();
		System.out.println("Submit Button has been clicked");
		Thread.sleep(1000);
		
		//Close the browser with driver.close()
		driver.close();
	}

}
