package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Create a WebDriver instance, named driver, with the FirefoxDriver().
		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//Open a browser with https://training-support.net/selenium/dynamic-attributes
        driver.get("https://training-support.net/selenium/dynamic-attributes");
		
		//Get the title of the page using driver.getTitle() and print out the title.
        String pageTitle = driver.getTitle();
		System.out.println("Page Title: "+pageTitle);
		
		//Find the input fields of the Sign Up form. Fill in the details in the fields with your own data.
		WebElement username = driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
		username.sendKeys("user1");
		System.out.println("Username 'user1' has been entered in username textbox");
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
		password.sendKeys("password");
		System.out.println("Password 'password' has been entered in password textbox");
		Thread.sleep(1000);
		
		WebElement confirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input"));
		confirmPassword.sendKeys("password");
		System.out.println("'password' has been entered in confirm password textbox");
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.xpath("//input[contains(@class,'email-')]"));
		email.sendKeys("test_user1@gmail.com");
		System.out.println("'test_user1@gmail.com' has been entered in email textbox");
		Thread.sleep(1000);
		
		WebElement signupButton = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
		signupButton.click();
		System.out.println("'Sign Up' Button has been clicked.");
		Thread.sleep(1000);
		
		//Wait for success message to appear and print it to the console.
		WebElement signupMessage = driver.findElement(By.xpath("//*[@id='action-confirmation']"));
		wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.visibilityOf(signupMessage));
		System.out.println("SignUp Message: "+signupMessage.getText());
		
		//Finally, close the browser.
		driver.close();
	}
}
