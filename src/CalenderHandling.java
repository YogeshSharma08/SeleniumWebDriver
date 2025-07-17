import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CalenderHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.findElement(By.partialLinkText("Top")).click();
		String month = "6";
		String year = "2027";
		String day ="5";
		String[] expectedlist = {month,day,year};
		int monthIndex = Integer.parseInt(month) - 1;
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String home = it.next();
		String cal = it.next();
		driver.switchTo().window(cal);
		driver.findElement(By.className("react-date-picker__inputGroup")).click();
		Actions ac = new Actions(driver);
//		WebElement yeararrow = driver.findElement(By.xpath("//*[@class='react-calendar__navigation']/button[5]"));
//		yeararrow.click();
//		yeararrow.click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()= '"+year+"']")).click();
		List<WebElement> months = driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"));
		months.get(monthIndex).click();
		driver.findElement(By.xpath("//button/abbr[text()='"+day+"']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//ac.moveToElement(yeararrow).doubleClick();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='react-date-picker__inputGroup']")));
//		String monthweb = driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']/input[2]")).getText();
//		String dayweb = driver.findElement(By.cssSelector("//div[@class='react-date-picker__inputGroup']/input[3]")).getText();
//		String yearweb = driver.findElement(By.cssSelector("//div[@class='react-date-picker__inputGroup']/input[4]")).getText();
//		
		List<WebElement> inputlist = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i =0; i<inputlist.size();i++)
		{
			System.out.print(inputlist.get(i).getAttribute("value")+("/"));
			Assert.assertEquals(inputlist.get(i).getAttribute("value"), expectedlist[i]);
		}
	}

}
