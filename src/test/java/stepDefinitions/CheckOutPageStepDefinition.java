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
import pageObjects.CheckOutPage;
import pageObjects.LandingPage;

public class CheckOutPageStepDefinition {
	
	public CheckOutPageStepDefinition(TestContextSetUp testContextSetUp)
	{
		this.testContextSetUp=testContextSetUp;
		this.checkOutPage=testContextSetUp.pageObjectManager.getCheckOutPage();
	}
	
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	TestContextSetUp testContextSetUp;
	public CheckOutPage checkOutPage;
	
	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order()
	{
		
		Assert.assertTrue(checkOutPage.verifyPromobtn());
		Assert.assertTrue(checkOutPage.verifyPlaceOrder());
		
		System.out.println("branch commit");
		System.out.println("branch commit gitY11");
		System.out.println("branch commit gitY2");
		
	}
	
	@Then("^user proceeds to checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout_and_validate_the_items_in_checkout_page(String name)
	{
		checkOutPage.checkOut();
	}
	

}
