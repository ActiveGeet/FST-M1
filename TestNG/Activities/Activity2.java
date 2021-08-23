package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity2 {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
	}

	@Test
	public void test_1() {
		//This test method should pass
		//use getTitle() to get and assert the title of the page.
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: "+pageTitle);
		Assert.assertEquals("Target Practice", pageTitle);
	}
	
	@Test
	public void test_2() {
		//This test method should fail
		//use findElement() to look for the black button. 
		WebElement blackButton = driver.findElement(By.className("ui black button"));
		
		System.out.println("Black button located: "+blackButton.isDisplayed());
		//Make an incorrect assertion. (This test case is meant to throw an error)
		Assert.assertTrue(blackButton.isDisplayed());
		Assert.assertEquals(blackButton.getText(), "black");
	}

	@Test(enabled = false)
	public void test_3() {
		//This test method should skip but should not be displayed as skipped
		
		System.out.println("Inside method test_3");
		String subHeading = driver.findElement(By.className("content")).getText();
		Assert.assertTrue(subHeading.contains("Practice"));
	}
	
	@Test
	public void test_4() throws SkipException{
		//This test method should skip and also should be displayed as skipped
			throw new SkipException("Skipping test_4 method ");
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
