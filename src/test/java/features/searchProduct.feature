Feature: Search and place the order for products.

@OfferPage
Scenario Outline: Search Experience for product search in both home and offers page

Given User is on GreenCart Landing page.		
When user searched with shortname <ProductName> and extracted atual name of product
Then user searched for same shortname <ProductName> in offers page 
And validate the product name in offers page matches with landing page

Examples:
|ProductName|
|Tom				|
|Beet				|
