package TestingParameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassA {
	
	@Parameters({"URL1", "URL2"})
	@Test
	public void aksjaksj(String url1,String url2)
	{
		
		System.out.println(url1);
		System.out.println(url2);
	}

}
