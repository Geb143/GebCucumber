Feature: Ensures user with correct credentials able to login to application and not able to login with incorrect credentials

  Scenario: Login with correct credentials
    Given I login with correct "userName" and "password" in login page
    Then I should be on HomePage