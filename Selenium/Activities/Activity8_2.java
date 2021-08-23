package SeleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_2 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 100);
        
		//Open the browser with https://training-support.net/selenium/tables using get() method.
        driver.get("https://training-support.net/selenium/tables");
		
		//Use findElements() in combination with xpath() to find the number of columns and rows (not counting the table header) and print them.
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='sortableTable']//tr/th"));
        int columnCount = columns.size();
        System.out.println("Number of columns available in table: "+ columnCount);
        
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']//tr"));
        int rowCount = rows.size();
        System.out.println("Number of rows available in table: "+ rowCount);
		
		//Find and print the cell value at the second row and second column.
        WebElement secCellValue = driver.findElement(By.xpath("//table[@id='sortableTable']//tr[2]/td[2]"));
    	System.out.println("Cell Value at the second row and second column before sorting : "+secCellValue.getText());
		
		//Click the header of the first column to sort by name.
    	WebElement nameHeader = driver.findElement(By.xpath("//table[@id='sortableTable']//tr/th[1]"));
    	nameHeader.click();
    	
		//Find and print the cell value at the second row and second column again.
    	WebElement cellvalueSec = driver.findElement(By.xpath("//table[@id='sortableTable']//tr[2]/td[2]"));
     	System.out.println("Cell Value at the second row and second column after sorting : "+cellvalueSec.getText());
 			
		
		//Print the cell values of the table footer.
		List<WebElement> footerCount = driver.findElements(By.xpath("//table[@id='sortableTable']//tfoot/tr/th"));
		System.out.println("Footer size: "+footerCount.size());
		for(WebElement footer : footerCount) {
			System.out.println("Footer value: "+footer.getText());
		}
		
		//Close the browser.
		driver.close();
	}

}
