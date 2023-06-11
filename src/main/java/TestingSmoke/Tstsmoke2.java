package TestingSmoke;

import org.testng.annotations.Test;

public class Tstsmoke2 {
	
	@Test(groups={"smoke"})
	public void fun1()
	{
		System.out.println("Hello Smoke1");
	}
	
	@Test
	public void fun2()
	{
		System.out.println("Hello not Smoke");
	}
	
	@Test(groups= {"smoke"})
	public void fun3()
	{
		System.out.println("Hello Smoke3");
	}

}
