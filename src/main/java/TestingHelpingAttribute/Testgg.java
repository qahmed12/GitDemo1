package TestingHelpingAttribute;

import org.testng.annotations.Test;

public class Testgg {
	
	@Test(enabled=true)
	public void fun3()
	{
		System.out.println("Hello3");
	}
	
	@Test(dependsOnMethods="fun3")
	public void fun2()
	{
		System.out.println("Hello2");
	}

}
