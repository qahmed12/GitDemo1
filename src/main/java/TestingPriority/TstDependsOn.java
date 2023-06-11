package TestingPriority;

import org.testng.annotations.Test;

public class TstDependsOn {
	
	@Test(dependsOnMethods="ZpiHomeLoan")
	void WebHomeLona()
	{
		System.out.println("I am webHomeLoan");
	}
	
	@Test
	public void ZpiHomeLoan()
	{
		System.out.println("I am ZpiHomeLoan");
	}

}
