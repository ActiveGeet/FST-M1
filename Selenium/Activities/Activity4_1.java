package SeleniumActivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) throws InterruptedException {
		//Create a WebDriver instance, named driver, with the FirefoxDriver().
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		//Open a browser with https://www.training-support.net
		driver.get("https://www.training-support.net");
		
		//Get the title of the page using driver.getTitle() and print out the title.
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: "+pageTitle);
		
		//Use findElement() with xpath() to find and click the "About Us" link on the page.
		WebElement aboutUs = driver.findElement(By.xpath("//*[@id='about-link']"));
		aboutUs.click();
		System.out.println("'About Us' link has been clicked.");
		Thread.sleep(1000);
		
		//Print the title of the new page that open when the link is clicked.
		String newPageTitle = driver.getTitle();
		System.out.println("New Page Title: "+newPageTitle);
		
		//Close the browser with driver.close()
		driver.close();
	}

}
