package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

	
	
	public WebDriver driver;
	
	public OfferPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	By searchbox =By.id("search-field");
	By productName = By.cssSelector("tr td:nth-child(1)");

	public void searchProduct(String shortName)
	{
		driver.findElement(searchbox).sendKeys(shortName);
	}
	
	public String getTextOfProductName()
	{
		return driver.findElement(productName).getText();
	}



}
