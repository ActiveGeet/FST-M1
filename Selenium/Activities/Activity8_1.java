package SeleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
		//Open the browser with https://training-support.net/selenium/tables using get() method.
        driver.get("https://training-support.net/selenium/tables");
		
		//Use findElements() in combination with xpath() to find the number of columns and rows (not counting the table header) and print them.
        List<WebElement> columns = driver.findElements(By.xpath("//table[contains(@class, 'striped table')]//tr[1]/td"));
        int columnCount = columns.size();
        System.out.println("Number of columns available in table: "+ columnCount);
        
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped table')]//tr"));
        int rowCount = rows.size();
        System.out.println("Number of rows available in table: "+ rowCount);
        
		//Find and print the all the cell values of the third row of the table.
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped table')]//tr[3]/td"));
        for(WebElement cellValue : thirdRow) {
        	System.out.println("Cell Value: "+cellValue.getText());
        }
        
		//Find and print the cell value at the second row and second column.
        WebElement secCellValue = driver.findElement(By.xpath("//table[contains(@class, 'striped table')]//tr[2]/td[2]"));
    	System.out.println("Cell Value at the second row and second column : "+secCellValue.getText());
		
		//Close the browser.
		driver.close();
	}

}
