package TestingParameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv{
	
	@Test(dataProvider="getData")
	public void testing(String userName,String userPassword)
	{
		System.out.println(userName);
		System.out.println(userPassword);
	}
	
	

@DataProvider
public Object[][] getData()

{
	Object[][] data=new Object[2][2];
	data[0][0]="user1";
	data[0][1]="pass1";
	
	data[1][0]="user2";
	data[1][1]="pass2";
	
	return data;
	}

}


