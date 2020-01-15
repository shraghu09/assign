package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome {
	
	public WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchlink;
	
	
	@FindBy(xpath="//input[@class='nav-input' and @type='submit']")
	private WebElement clickonsearch;
	
	
   
    	
      @FindBy(xpath="//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")
       WebElement alliphones;

	
	@FindBy(xpath="//span[text()='Apple' and @class='a-size-base a-color-base']")
	private WebElement apple;
	
	
		@FindBy(xpath="//span[text()='Apple iPhone XR (64GB) - Yellow']")
	    private WebElement appleyellow;
		
		@FindBy(xpath="//span[text()='Apple iPhone 6s (32GB) - Rose Gold']")
		private WebElement applegold;
		
		
		@FindBy(xpath="(//span[@class='a-price-whole' and text()='47,900'])[2]")
		private WebElement slectprice;
		
	   
	
	 public Welcome(WebDriver driver)
	 {
		 
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void searchitem()
	 {
		 searchlink.sendKeys("iPhone XR (64GB)- yellow");
		 
	 }
	 
	 public void seachbutton()
	 {
		 clickonsearch.click();
	 }
	
	 
		 public void selectmobile()
		 {
			 apple.click();
		 }
		 
		 public void priceselect()
		 {
		String a = slectprice.getText();
		System.out.println(a);
		
		 
			
			
			
		
		 }
	 

}
