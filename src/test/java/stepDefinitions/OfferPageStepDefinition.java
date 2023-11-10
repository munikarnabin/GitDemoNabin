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
import pageObjects.OfferPage;

public class OfferPageStepDefinition {
	
	public OfferPageStepDefinition(TestContextSetUp testContextSetUp)
	{
		this.testContextSetUp=testContextSetUp;
	}
	
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	TestContextSetUp testContextSetUp;
	
	
	@Then("^user searched for same shortname (.+) in offers page$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exists(String shortName) throws InterruptedException {
	   
		
		switchToWindow();
		OfferPage offerPage = new OfferPage(testContextSetUp.driver);
		offerPage.searchProduct(shortName);
		Thread.sleep(3000);
		offerPageProductName=offerPage.getTextOfProductName();
	}
	
	public void switchToWindow()
	{
		LandingPage landingPage = testContextSetUp.pageObjectManager.getLandingPage();
		landingPage.topDealPage();
		testContextSetUp.genericUtils.SwitchWindowToChild();
		
	}
	
	@Then("validate the product name in offers page matches with landing page")
	public void validate_the_product_name_in_offers_page_matches_with_landing_page()
	{
		Assert.assertEquals(offerPageProductName, testContextSetUp.landingPageProductName);
	}

}
