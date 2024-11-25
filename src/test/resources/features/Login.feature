Feature: user Login
  Scenario: user is able to login valid credentials
    Given user enters valid username in the username field
    And user enters valid password in the password field
    When user clicks on the Logins button
    Then user is logged successfully

    Scenario: user is not able to login with invalid credentials
      Given user enters invalid username in the username field
      And user enters invalid password in the password field
      When user clicks on the Logins button
      Then user is not logged into the application




