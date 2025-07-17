import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ChromeOptions options = new ChromeOptions();
//	    options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.proteantech.in/");
		Actions a = new Actions(driver);
//		WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(
	    //a.moveToElement(driver.findElement(By.xpath("//html/body/div[2]/div[1]/div[2]/div/nav/ul/li[3]/button"))).build().perform();

		WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("(//ul[@class='Navbar_menus__CndHB Navbar_displayFlex__UzwsT']/li)[2]")
			));
		a.moveToElement(menu).build().perform();

	}

}
