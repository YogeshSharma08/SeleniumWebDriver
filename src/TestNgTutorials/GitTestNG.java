package TestNgTutorials;

import org.testng.annotations.Test;

public class GitTestNG {
	
	
	@Test	
	public  void first()
	{
		System.out.println("develop branch first change");
	}
	
	
	@Test	
	public  void second()
	{
		System.out.println("develop branch second change");
	}
	
	@Test	
	public  void firstChangeFromOther()
	{
		System.out.println("develop branch new  change");
	}
	
	@Test	
	public  void lastChangeFromOther()
	{
		System.out.println("develop branch last  change");
	}
	
	@Test	
	public  void finalChangeFromOther()
	{
		System.out.println("develop branch last  change");
	}
	
	
}
