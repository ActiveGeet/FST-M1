package Activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

	public class Activity1 {
		
		WebDriver driver;
		
		@BeforeClass
		public void beforeClass() {
			//a. Open a browser.
			driver = new FirefoxDriver();
			System.out.println("Browser Launched");
			Reporter.log("Browser Launched");
		}
		
		@Test
		public void testWebTitle() {
			//b. Navigate to ‘http://alchemy.hguy.co/orangehrm’.
			String url = "http://alchemy.hguy.co/orangehrm";
			driver.get(url);
			System.out.println("User navigated to URL: "+url);
			Reporter.log("User navigated to URL: "+url);
			
			//c. Get the title of the website.
			String webTitle = driver.getTitle();
			System.out.println("Title of Website: "+webTitle);
			Reporter.log("Title of Website: "+webTitle);
			
			
			//d. Make sure it matches “OrangeHRM” exactly.
			Assert.assertEquals(webTitle, "OrangeHRM");
			Assert.assertTrue(webTitle.contentEquals("OrangeHRM"));
		}
		
		
		@AfterClass
		public void afterClass() {
			//e. close the browser.
			driver.close();
		}
	
}
