package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssiggnmentSix {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		WebElement tab = driver.findElement(By.cssSelector(".table-display"));
		List<WebElement> tabrow = tab.findElements(By.tagName("tr"));
		int rowsize = tabrow.size();
		List<WebElement> tabcol = tab.findElements(By.tagName("th"));
		int colsize = tabcol.size();
		System.out.println(rowsize + " "+ colsize);
		
		//List<WebElement> data = driver.findElements(By.xpath("table[@id='product']/tr[2]/td"));
		WebElement secondrow = tabrow.get(2);
		List<WebElement> data = secondrow.findElements(By.tagName("td"));
		for(int i=0;i<data.size();i++) {
			System.out.println( data.get(i).getText());
		}
		
	}

}
