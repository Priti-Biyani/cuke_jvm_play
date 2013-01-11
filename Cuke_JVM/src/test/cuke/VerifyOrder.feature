Feature: Verify Order

Scenario: Verify Order delivery
    Given I visit order status page
    Then I should see order delivered status
