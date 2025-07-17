package TestNgTutorials;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DayThree {
	
	@BeforeMethod
	public void beforeFirstMethod()
	{
		System.out.println("first method of day 3");
	}
	
	
	@Test(groups = {"Smoke"})
	public void WebLoginCarLoan()
	{
		System.out.println("Web Car Loan");
	}
	
	@Test	
	public void MobileSignInLoan()
	{
		System.out.println("Mobile Sign In Loan");
	}
	
	@Test(dataProvider="getData")
	public void MobileSignOutCarLoan(String username, String password)
	{
		System.out.println("Mobile Sign Out Loan");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	
	@AfterMethod
	public void AfterFirstMethod()
	{
		System.out.println("Last method of day 3");
	}


	
	@Test	
	public void MobileLoginCarLoan()
	{
		System.out.println("Mobile Car Loan");
	}


	
	@Test(dependsOnMethods= {"MobileLoginCarLoan","MobileSignOutCarLoan"})	
	public void APILoginCarLoan()
	{
		System.out.println("API Car Loan");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "FirstName";
		data[0][1] = "FirstPassword";
		
		data[1][0] = "SecondName";
		data[1][1] = "SecondPassword";
		
		data[2][0] = "ThirdName";
		data[2][1] = "ThirdPassword";
		
		return data;
		
	}


}
