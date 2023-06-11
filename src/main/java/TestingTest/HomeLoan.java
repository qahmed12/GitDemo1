package TestingTest;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoan {
	
	@BeforeTest	
	public void beforLoan()
	{
		System.out.println("I am BeforeTest");
	}
	@Test
	public void homeLoan()
	{
		System.out.println("HomeLoan");
	}
	
	
	
}
