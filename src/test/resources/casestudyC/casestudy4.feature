Feature: add to cart testing
Scenario: The one where user moves to cart without adding any item in it
Given Alex has registered into testme app
When Alex search for particular product like headphones
And try to proceed to payment without adding any thing to it
Then testme app doesnt display the cart icon
