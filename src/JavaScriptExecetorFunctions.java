import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptExecetorFunctions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		List<WebElement> val = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum = 0;
		
		for(int i=0; i<val.size();i++)
		{
			sum = sum + Integer.parseInt(val.get(i).getText());
		}
		System.out.println(sum);
		String[] finalstr = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":");
		int finalstr1 = Integer.parseInt(finalstr[1].trim());
//		if(sum == finalstr1)
//		{
//			System.out.println("matched");
//		}else {
//			System.out.println("not");
//		}
//		
		Assert.assertEquals(sum, finalstr1 );
	
	}

}
