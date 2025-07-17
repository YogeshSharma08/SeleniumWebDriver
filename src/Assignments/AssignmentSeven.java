package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentSeven {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php/");
		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
//		Actions a = new Actions(driver);
		Thread.sleep(2000);
//		a.moveToElement(driver.findElement(By.id("ui-id-6"))).click().build().perform();
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("ui-id-6")).click();
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	}

}
