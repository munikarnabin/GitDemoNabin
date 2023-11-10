Feature: place the order for products.

@PlaceOrder
Scenario Outline: Add products to cart and checkout.

Given User is on GreenCart Landing page.		
When user searched with shortname <ProductName> and extracted atual name of product
And user added "3" products to the cart
Then user proceeds to checkout and validate the <ProductName> items in checkout page
And verify user has ability to enter promo code and place the order

Examples:
|ProductName|
|Tom				|

