package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		//"span.checkmark"
		driver.findElements(By.cssSelector("span.checkmark")).get(1).click();
		driver.findElement(By.id("okayBtn")).click();
		//driver.switchTo().alert().accept();
		WebElement dropdown = driver.findElement(By.cssSelector("select.form-control"));
		Select slt = new Select(dropdown);
		slt.selectByIndex(2);
		driver.findElement(By.id("terms")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("signInBtn")));
		driver.findElement(By.id("signInBtn")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("signInBtn")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		additems(driver);
		
		

	}
	public static void additems(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		List<WebElement> addbuttons = driver.findElements(By.cssSelector(".card-footer.btn-info"));
		for(int i=0; i < addbuttons.size(); i++)
		{
			
			addbuttons.get(i).click();
		}
		driver.findElement((By.partialLinkText("Checkout"))).click();
	}

}
