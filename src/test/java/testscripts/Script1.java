package testscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.Basetest;

import pages.Flipkartwelcome;
import pages.Welcome;

public class Script1 extends Basetest{
	
	@Test(priority=1)
	public void runapp() throws InterruptedException, IOException,NumberFormatException
	{
		driver.get((getdata("url")));
		
		Welcome wl=new Welcome(driver);
		Flipkartwelcome Fw=new Flipkartwelcome(driver);
		wl.searchitem();
		wl.seachbutton();
		wl.selectmobile();
		String xp="//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']";
		List<WebElement> allelement = driver.findElements(By.xpath(xp));
		
		
			
		
		
		for(WebElement cb:allelement)
		{
			
			String text = cb.getText();
		    System.out.println("All apple phones are " +text);
		}
		

		List<WebElement> allprice = driver.findElements(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small']"));
		for(WebElement price:allprice)
		{
			
			String text1 = price.getText();
			System.out.println("All phones price are " +text1);
		}
		
		
		Thread.sleep(5000);
		wl.priceselect();
		  wl.priceselect();
		WebElement a = driver.findElement(By.xpath("(//span[contains(@class,'a-price-whole')])[2]"));
		String value = a.getText();
		Integer v = Integer.valueOf(value.replaceAll(",", ""));
		
		
		//flipkart
		driver.navigate().to(getdata("url2"));
		Fw.closebutton();
		Fw.textfieldclick();
		Fw.buttonclick();
		Fw.selectapple();
		
List<WebElement> allelement1 = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		
		
			
		
		
		for(WebElement cb:allelement1)
		{
			
			String text3 = cb.getText();
		    System.out.println("All Flip kart dispaly apple phones are " +text3);
		}
		
List<WebElement> allelement4 = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		
		
			
		
		
		for(WebElement cb:allelement4)
		{
			
			String text4 = cb.getText();
		    System.out.println("All Flip cart display apple phones price are " +text4);
		}
		Fw.compareprice();
		
		WebElement b = driver.findElement(By.xpath("//div[@class='_1vC4OE _2rQ-NK' and contains(text(),'53,999')]"));
		String value2 = b.getText();
		int s2 = Integer.parseInt(value2.replace(",", "").replace("₹", ""));
		
		
		if(v>s2)
		{
			System.out.println("amazon iphone rate is high flip kart is good");
		}
		else
		{
			System.out.println("flipkart rate is high amazon is good");
		}
		
		
}
}