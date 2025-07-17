package TestNgTutorials;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DayFour {
	
	@Test	
	public void WebLoginHomeLoan()
	{
		System.out.println("Web Home Loan");
	}
	
	@BeforeClass	
	public void beforeclas()
	{
		System.out.println("before class");
	}
	
	@AfterClass	
	public void afterclas()
	{
		System.out.println("after class");
	}
	
	@Parameters({ "URL" })
	@Test(groups = {"Smoke"})	
	public void MobileLoginHomeLoan(String url)
	{
		System.out.println("Mobile Home Loan");
		System.out.println(url);
	}

	
	@Test	
	public void APILoginHomeLoan()
	{
		System.out.println("API Home Loan");
	}


}
