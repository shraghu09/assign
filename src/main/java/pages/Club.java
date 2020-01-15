package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Club {
	public WebDriver driver;
	
	
	
	@FindBy(xpath="//div[@class='brand-header-GlobalNavActions__searchWrap--2XBZ1']")
	private WebElement clickonsearch;
	
	@FindBy(id="mainSearch")
	private WebElement seachclub;
	
	@FindBy(xpath="//span[text()='Club Mahindra Madikeri, Coorg']")
	private WebElement clickclub;
	
	@FindBy(xpath="//div[@class='hotels-community-content-common-ContextualCTA__currentOption--3Wd5D']")
	private WebElement clickonreview;
	
	@FindBy(xpath="//div[@class='easyClear bigRatingParent']/span")
	private WebElement ratingdisplay;
	
	
	@FindBy(id="ReviewTitle")
	private WebElement clickreviewtitle;
	
	
	@FindBy(id="ReviewText")
	private WebElement writereview;
	
	
	@FindBy(xpath="//div[@class='c-cell jfy_cloud tag content category-withFriends']")
	private WebElement clickfriends;
	
	
	@FindBy(xpath="//select[@name='trip_date_month_year']")
	private WebElement selectmonth;
	
	@FindBy(id="noFraud")
	private WebElement selectcheckbox;
	
	@FindBy(id="SUBMIT")
	private WebElement clicksubmit;
	
			
	
	
	public Club(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchitem()
	{
		clickonsearch.click();
	}

	public void enetrclubmahindra()
	{
		seachclub.sendKeys("Club Mahindra");
		seachclub.sendKeys(Keys.ENTER);
	}
	
	public void selectkoorg()
	{
		clickclub.click();
	}
	
	public void writereview()
	{
		
		
		clickonreview.click();	
	}
	
	
		
	
	public void selectrating()
	{
		Actions actions_1k = new Actions(driver);
		

				actions_1k.moveToElement(ratingdisplay).build().perform();
				
	}
	
	public void selectreviewTitle(String title)
	{
		clickreviewtitle.sendKeys(title);
		
		
	}
	
	public void writereview(String review)
	{
		writereview.sendKeys(review);
	}
	
	public void friendsclick()
	{
		clickfriends.click();
	}
	
	public void monthselect()
	{
		Select sel=new Select(selectmonth);
		
		sel.selectByIndex(2);
		
				
	}
	public void checkboxselect()
	{
		selectcheckbox.click();
	}
	
	public void selectclick()
	{
		clicksubmit.click();
	}
	
	
	
}
