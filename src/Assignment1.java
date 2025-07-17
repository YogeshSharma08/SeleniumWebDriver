import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	driver.findElement(By.name("name")).sendKeys("Prayash");
	driver.findElement(By.name("email")).sendKeys("prayash@ghgh.com");
	driver.findElement(By.id("exampleInputPassword1")).sendKeys("pm123");
	driver.findElement(By.xpath("//input[@id = 'exampleCheck1']")).click();
	WebElement selectoption = driver.findElement(By.id("exampleFormControlSelect1"));
	Select dropdown = new Select(selectoption);
	dropdown.selectByIndex(0);
	driver.findElement(By.id("inlineRadio2")).click();
	driver.findElement(By.name("bday")).sendKeys("08112000");
	driver.findElement(By.cssSelector(".btn.btn-success")).click();
	
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.xpath("//div[@class = 'alert alert-success alert-dismissible']")).getText());

	
	}
	
	
}
