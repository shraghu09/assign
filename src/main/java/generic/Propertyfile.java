package generic;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Propertyfile {
	public WebDriver driver;

	static Properties prop;
	
	public static void readdata() throws IOException
	{
		
	prop=new Properties();
	
	File file = new File(System.getProperty("user.dir")+"//property/input.properties");
	  
	
	FileReader fr = new FileReader(file);
	prop.load(fr);
	
	
}

	public static String getdata(String data) throws IOException
	{
		readdata();
		String Data = prop.getProperty(data);
		return Data;
		
	}
	
	
}