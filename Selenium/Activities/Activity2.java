package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException {
		// Create a WebDriver instance, named driver, with the FirefoxDriver().
		WebDriver driver = new FirefoxDriver();
		
		//Open a browser with https://www.training-support.net
		String Url = "https://www.training-support.net";
		driver.get(Url);
		Thread.sleep(2000);
		
		//Get the title of the page using driver.getTitle() and print out the title
		String pageTitle = driver.getTitle();
		System.out.println("Title of Page: "+pageTitle);
		
		//Use findElement() with the following locators to find the "About Us" link:
			//id()
			WebElement aboutUsId = driver.findElement(By.id("about-link"));
			
			//className()
			WebElement aboutUsClass = driver.findElement(By.className("green"));

			//linkText()
			WebElement aboutUsLinkText = driver.findElement(By.linkText("About Us"));
			
			//cssSelector()
			WebElement aboutUsCSS = driver.findElement(By.cssSelector(".green"));

		//Print the text in the WebElement using the getText() method.
		System.out.println("Text of WebElement using ID: "+aboutUsId.getText());
		System.out.println("Text of WebElement using Class: "+aboutUsClass.getText());
		System.out.println("Text of WebElement using LinkText: "+aboutUsLinkText.getText());
		System.out.println("Text of WebElement using CSS: "+aboutUsCSS.getText());
		
		//Close the browser with driver.close()
		//driver.close();
	}

}
