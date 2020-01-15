package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkartwelcome {
	public WebDriver driver;
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	private WebElement clickclose;
	
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement clicktextfield;
	
	
	@FindBy(xpath="//button[@class='vh79eN' and @type='submit']")
	private WebElement clickbutton;
	
	
	@FindBy(xpath="//div[@class=\"_1GEhLw\" and text()='Apple']")
	private WebElement clickapple;
	
	@FindBy(xpath="//div[@class='_1vC4OE _2rQ-NK' and contains(text(),'53,999')]")
	private WebElement selectmobileprice;
	
	public Flipkartwelcome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void closebutton()
	{
		clickclose.click();
	}
	
	public void textfieldclick()
	{
	  clicktextfield.sendKeys("iphone xr(64gb) yellow");
	
	}
	public void buttonclick()
	{
		clickbutton.click();
	}
	
	public void selectapple()
	{
		clickapple.click();
	}
	
	public void compareprice()
	{
		String b = selectmobileprice.getText();
		
		System.out.println(b);
	}

}
