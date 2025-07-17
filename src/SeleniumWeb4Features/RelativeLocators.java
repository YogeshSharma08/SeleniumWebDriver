package SeleniumWeb4Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		WebElement labelAbove = driver.findElement(with(By.tagName("label")).above(nameEditBox));
		System.out.println(labelAbove.getText());
		
		WebElement dob =driver.findElement(By.cssSelector("[for='dateofBirth']")); 
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		WebElement checkBoxLabel = driver.findElement(By.cssSelector(".form-check-label"));
		driver.findElement(with(By.tagName("input")).toLeftOf(checkBoxLabel)).click();
		WebElement radio = driver.findElement(By.id("inlineRadio1"));
		System.out.println( driver.findElement(with(By.tagName("label")).toRightOf(radio)).getText());
		

	}

}
