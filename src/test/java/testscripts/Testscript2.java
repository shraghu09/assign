package testscripts;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generic.Basetest;
import pages.Club;

public class Testscript2 extends Basetest {
	
   
	
	@Test(priority=2)
	public void script2() throws IOException, InterruptedException, AWTException
	{
		
		 
		Club cl=new Club(driver);
       driver.get(getdata("url1"));
     //  System.out.println(driver.getTitle());
       cl.searchitem();
       cl.enetrclubmahindra();
       cl.selectkoorg();
       Thread.sleep(3000);
       // sp.winhandle();
      
     
       ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(tabs.get(1));
       JavascriptExecutor jse = (JavascriptExecutor)driver;
       jse.executeScript("window.scrollBy(0,2550)");
      // System.out.println(driver.getTitle());
       cl.writereview();
     
       
        Thread.sleep(5000);
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(2));
        
       
     //  System.out.println(driver.getTitle());
       WebElement element_1 = driver.findElement(By.cssSelector("span[id=bubble_rating]"));
		Actions actions_1k = new Actions(driver);		Thread.sleep(3000);
		 
		
				actions_1k.moveToElement(element_1).click(element_1).build().perform();
		 
		 
			
				//System.out.println(driver.getTitle());
     
				
				cl.selectreviewTitle("good");
       JavascriptExecutor jse1 = (JavascriptExecutor)driver;
       jse1.executeScript("window.scrollBy(0,1000)");
       
       WebElement element_2 = driver.findElement(By.xpath("//span[@id='qid12_bubbles']"));
		Actions actions_2k = new Actions(driver);		Thread.sleep(3000);
		 
		
				actions_2k.moveToElement(element_2).click(element_2).build().perform();
       cl.writereview("good goodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgoodgood");
       cl.friendsclick();
       cl.monthselect();
       cl.checkboxselect();
       cl.selectclick();
       
	}
}
