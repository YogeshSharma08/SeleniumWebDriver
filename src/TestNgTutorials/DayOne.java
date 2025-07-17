package TestNgTutorials;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DayOne {
	
	@AfterTest
	public void lastExecute() {
		System.out.println("Last Test of Test Module");
	}
	
	@AfterSuite
	public void lastExecuteSuite() {
		System.out.println("Last Test of Suite Module");
	}
	
	@Test(groups = {"Smoke"})	
	public  void first()
	{
		System.out.println("Day 1");
	}
	
	@Test
	public static void firstDemo()
	{
		System.out.println("Day 1 and demo");
	}
	
}
