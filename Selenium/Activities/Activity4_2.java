package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Create a WebDriver instance, named driver, with the FirefoxDriver().
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		//Open a browser with https://training-support.net/selenium/simple-form
		driver.get("https://training-support.net/selenium/simple-form");
		
		//Get the title of the page using driver.getTitle() and print out the title.
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: "+pageTitle);
		
		//Use findElement() with xpath() to find all the input fields on the page.
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement contactNo = driver.findElement(By.xpath("//input[@id='number']"));
		
		//Fill in the details in the fields using the sendKeys() method.
		firstName.sendKeys("John");
		System.out.println("'Santa' has been entered in First Name textbox.");
		Thread.sleep(1000);
		
		lastName.sendKeys("S");
		System.out.println("'Cruz' has been entered in Last Name textbox.");
		Thread.sleep(1000);
		
		email.sendKeys("test@gmail.com");
		System.out.println("'test@gmail.com' has been entered in Email textbox.");
		Thread.sleep(1000);
		
		contactNo.sendKeys("9876543210");
		System.out.println("'9876543210' has been entered in Contact Number textbox.");
		Thread.sleep(1000);
		
		//Click the submit button at the end of the form to submit the form.
		WebElement submitBtn = driver.findElement(By.xpath("//*[contains(@value,'submit')]"));
		submitBtn.click();
		System.out.println("Submit Button has been clicked");
		Thread.sleep(1000);
		
		//Close the browser with driver.close()
		driver.close();
		
	}

}
