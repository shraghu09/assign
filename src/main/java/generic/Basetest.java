package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Basetest extends Propertyfile {
	
	public WebDriver driver;
	
	@BeforeSuite
		public void setpath()
	{
		System.setProperty("webdriver.chrome.driver","./jar/chromedriver.exe");
	}
	
		
	


	@BeforeMethod
    public void openbrowser()
   {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	

}