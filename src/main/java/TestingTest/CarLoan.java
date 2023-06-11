package TestingTest;


import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarLoan {
	
	
	@BeforeSuite	
	public void beforsuite()
	{
		System.out.println("I am beforsuite");
	}
	
	
	@Test
	public void carLoan()
	{
		System.out.println("carLoan");
	}
	
	
	//@AfterSuite	
	public void beforLoan()
	{
		System.out.println("I am aftersuite");
	}

}
