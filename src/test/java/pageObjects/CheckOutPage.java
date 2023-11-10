package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	
	By cartBag = By.cssSelector("img[alt='Cart']");
	By proceedToChkOut = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By applybtn =By.cssSelector(".promoBtn");
	By productName = By.cssSelector(".product-name");
	By placeOrderBtn = By.xpath("//button[contains(text(),'Place Order')]");
	
	public WebDriver driver;
	
	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
	}


	public void checkOut()
	{
		driver.findElement(cartBag).click();
		driver.findElement(proceedToChkOut).click();
	}
	
	public boolean verifyPromobtn()
	{
		return driver.findElement(applybtn).isDisplayed();
	}
	
	public boolean verifyPlaceOrder()
	{
		return driver.findElement(placeOrderBtn).isDisplayed();
	}
	
	public String getTextOfProductName()
	{
		return driver.findElement(productName).getText();
	}
	
	

}

