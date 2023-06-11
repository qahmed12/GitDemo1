package TestingSmoke;

import org.testng.annotations.Test;

public class Tstsmoke {
	
	@Test(groups={"smoke"})
	public void fun4()
	{
		System.out.println("Hello Smoke4");
	}
	
	@Test
	public void fun5()
	{
		System.out.println("Hello not Smoke");
	}
	
	@Test(groups= {"smoke"})
	public void fun6()
	{
		System.out.println("Hello Smoke6");
	}

}
