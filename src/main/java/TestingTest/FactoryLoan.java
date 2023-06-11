package TestingTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FactoryLoan {
	
	@Test
	public void factoryLoan()
	{
		System.out.println("FactoryLoan");
	}
	
	@AfterTest	
	public void afterLoan()
	{
		System.out.println("I am AfterTest");
	}

}
