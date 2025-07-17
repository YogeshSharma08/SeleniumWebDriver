package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElement(By.xpath("//label[@for='benz']")).getText());
		String option = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		driver.findElement(By.id("checkBoxOption2")).click();
		WebElement element = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(option);
		driver.findElement(By.id("name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		String s = driver.switchTo().alert().getText();
		System.out.println( driver.switchTo().alert().getText());
		if(s.contains(option))
		{
			System.out.println("contains");
			driver.switchTo().alert().accept();
		}
		
		
		
		
		

	}

}
