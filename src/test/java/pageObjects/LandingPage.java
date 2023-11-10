package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	By searchbox =By.xpath("//input[@type='search']");
	By productName = By.cssSelector("h4.product-name");
	By topDealsLink =By.linkText("Top Deals");
	By increment = By.cssSelector(".increment");
	By addToCart = By.cssSelector(".product-action button");
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}


	public void searchProduct(String shortName)
	{
		driver.findElement(searchbox).sendKeys(shortName);
	}
	
	public String getTextOfProductName()
	{
		return driver.findElement(productName).getText();
	}
	
	public void incrementProduct(int quantity)
	{
		int i= quantity-1;
		
		while(i>0)
		{
			driver.findElement(increment).click();
			
			i--;
		}
	}
	
	public void addProductToCart()
	{
		driver.findElement(addToCart).click();
	}
	
	public void topDealPage()
	{
		driver.findElement(topDealsLink).click();
	}

	public String getTitleLandinPage()
	{
		return driver.getTitle();
	}
}

