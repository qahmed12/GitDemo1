package TestingProperty;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ProFile {
	
	public static void main(String[] args) throws IOException
	{
		Properties pro=new Properties();
		
		FileInputStream fI=new FileInputStream("C:\\Users\\HP\\Downloads\\QASIMWS\\Testing\\src\\main\\java\\TestingProperty\\File1");
		pro.load(fI);		
		System.out.println(pro.getProperty("browser"));
		System.out.println(pro.getProperty("userName"));
		
		FileOutputStream fO=new FileOutputStream("C:\\Users\\HP\\Downloads\\QASIMWS\\Testing\\src\\main\\java\\TestingProperty\\File1");
		pro.setProperty("browser", "Safari");
		pro.setProperty("userName", "Ahmed");
		
		pro.store(fO, null);
		
		
	}

}
