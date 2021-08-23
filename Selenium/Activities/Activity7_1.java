package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//Open a browser with https://training-support.net/selenium/dynamic-attributes
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		
		//Get the title of the page using driver.getTitle() and print out the title.
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: "+pageTitle);
		
		//Find the username and password input fields. Type in the credentials:
		//username: admin
		//password: password
		WebElement username = driver.findElement(By.xpath("//input[contains(@class,'username-')]"));
		username.sendKeys("admin");
		System.out.println("Username 'admin' has been entered in username textbox");
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@class,'password-')]"));
		password.sendKeys("password");
		System.out.println("Password 'password' has been entered in password textbox");
		Thread.sleep(1000);
		
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		loginButton.click();
		System.out.println("Login Button has been clicked.");
		Thread.sleep(1000);
		
		//Wait for login message to appear and print the login message to the console.
		WebElement loginMessage = driver.findElement(By.xpath("//*[@id='action-confirmation']"));
		wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.visibilityOf(loginMessage));
		System.out.println("Login Message: "+loginMessage.getText());
		
		//Finally, close the browser.
		driver.close();
		
	}

}
