package TestingParameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv1 {
	
	@Test(dataProvider="getData")
	public void test(String userName,String userPass)
	
	
	{
	System.out.println(userName);	
	System.out.println(userPass);	
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		
		data[0][0]="QASIm";
		data[0][1]="pass1";
		
		data[1][0]="user2";
		
		data[1][1]="pass2";
		
		return data;
		
		
	}

}
