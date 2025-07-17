package TestNgTutorials;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DayTwo {
	
	@Test(groups = {"Smoke"})
	public static void first()
	{
		System.out.println("Day 2");
	}
	
	@BeforeTest(enabled=false)
	public void lastExecute() {
		System.out.println("First Test of Test Module");
	}
	
	@BeforeSuite
	public void lastExecuteSuite() {
		System.out.println("First Test of Suite Module");
	}
	

}
