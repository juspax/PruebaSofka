@All

Feature: Enter the site and make a purchase flow
  As user
  I want to enter the platform
  To make a purchase

  Background: Login to the main platform
    Given I access the initial platform to make the purchase process

  @CaseOne
  Scenario Outline: Validate the purchase process
    When I enter the platform
      | <userName> | <password> | <firstName> | <lastName> | <postalCode> |
    Then Verify the correct purchase "Thank you for your order!"
    Examples:
      | userName      | password     | firstName | lastName | postalCode |
      | standard_user | secret_sauce | Juan      | Castillo | 50001      |
