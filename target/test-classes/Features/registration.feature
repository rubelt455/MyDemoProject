Feature: Verify Registration Functionality
  Scenario: New customer registration
    Given I am on the registration page
    When I enter a valid Username "Jon5D66oe123"
    And I enter a valid Email address "jo5hn66oe@example.com"
    And I enter a valid Password "joho567e@example.com"
    And I submit the registration form
    Then I should be automatically redirected to the customer login page
