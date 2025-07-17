import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaStreamProblemsSolving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> data = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> listdata= data.stream().map(s-> s.getText()).collect(Collectors.toList());
		List<String> newListdata = listdata.stream().sorted().collect(Collectors.toList());
		System.out.println(listdata);
		System.out.println(newListdata);
		
		Assert.assertTrue(listdata.equals(newListdata));
		
		List<String> price;
		do {
			
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s-> s.getText().contains("Rice")).map(s-> priceofveggie(s)).collect(Collectors.toList());
			price.stream().forEach(s->System.out.println(s));
			
			if(price.size() <1)
			{
				driver.findElement(By.cssSelector("[aria-label='Next'")).click();
			}
		}while(price.size() <1);

	}
	public static String priceofveggie(WebElement s)
	{
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return price;
	}

}
