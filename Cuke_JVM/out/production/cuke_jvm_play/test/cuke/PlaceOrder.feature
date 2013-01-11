Feature: Place Order

  Scenario: Place Order online
   Given I visit the merchant site
   When I place the order
   Then I should see successful update message


 Scenario: Verify Order delivery
    Given I visit order status page
    Then I should see order delivered status


