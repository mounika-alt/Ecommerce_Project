Feature: Add product to cart
 @TestRun01
  Scenario: HN website add product to cart
    Given that we are on the home page of HN website
    When I get product name and add the product to cart
    Then Item added to cart popup window is presented
    Then I select view cart option
    Then I am presented with shopping cart page
    Then I check if selected product is added to cart
    