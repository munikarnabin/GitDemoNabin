package stepDefinitions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Utils.TestContextSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;

public class LandingPageStepDefinition {
	
	public LandingPageStepDefinition(TestContextSetUp testContextSetUp)
	{
		this.testContextSetUp=testContextSetUp;
		this.landingPage = testContextSetUp.pageObjectManager.getLandingPage();
	}
	
	public WebDriver driver;
	public LandingPage landingPage;
	public String landingPageProductName;
	public String offerPageProductName;
	TestContextSetUp testContextSetUp;
	
	@Given("User is on GreenCart Landing page.")
	public void user_is_on_green_cart_landing_page() {
	    Assert.assertTrue(landingPage.getTitleLandinPage().contains("GreenKart"));
		
	}
	
	@When("^user searched with shortname (.+) and extracted atual name of product$")
	public void user_searched_with_shortname_and_extracted_atual_name_of_product(String shortName) throws InterruptedException {
		
		
		landingPage.searchProduct(shortName);
		Thread.sleep(3000);
	    testContextSetUp.landingPageProductName = landingPage.getTextOfProductName().split("-")[0].trim();
	    System.out.println( testContextSetUp.landingPageProductName);
	    
	}
	
	@When("user added {string} products to the cart")
	public void user_added_products_to_the_cart(String quantity)
	{
		
		landingPage.incrementProduct(Integer.parseInt(quantity));
		landingPage.addProductToCart();
		
		
	}
	

}
