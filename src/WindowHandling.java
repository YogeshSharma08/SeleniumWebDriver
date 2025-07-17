import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator <String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		String first = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim();
		String emailid = first.split(" ")[0];
		System.out.println(emailid);
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(emailid);
		
		
	}

}
