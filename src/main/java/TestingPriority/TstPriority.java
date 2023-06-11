package TestingPriority;

import org.testng.annotations.Test;

public class TstPriority {
	
	@Test(priority=3)
	public void priority1()
	{
		System.out.println("Priority1");
	}
	@Test(priority=0)
	public void priority2()
	{
		System.out.println("Priority2");
	}
	@Test(priority=1)
	public void priority3()
	{
		System.out.println("Priority3");
	}

}
