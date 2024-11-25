Feature: user Login
  Scenario: user is able to login valid credentials
    Given user enters valid username in the email field
    And user enters valid password in the email_password field
    When user clicks on the Login button
    Then user is logged successfull

  Scenario: user is not able to login with invalid credentials
    Given user enters invalid username in the email field
    And user enters invalid password in the email_password field
    When user clicks on the Login button
    Then error message is displayed




