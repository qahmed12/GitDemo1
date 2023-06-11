package TestingHelpingAttribute;

import org.testng.annotations.Test;

public class Abcd {
	
	@Test(invocationCount=5)
	public void fun1()
	{
		System.out.println("Hello1");
	}

	@Test(dependsOnMethods="fun1")
	public void fun2()
	{
		System.out.println("Hello2");
	}
	
	@Test(enabled=true)
	public void fun3()
	{
		System.out.println("Hello3");
	}

}
