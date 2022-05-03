@activity5
Feature: Data driven test with Example

  Scenario Outline: Testing with Data from Scenario
    Given TUser is on Login page
    When TUser enters "<Usernames>" and "<Passwords>"
    Then TRead the page title and confirmation message
    And TClose the Browser

    Examples:
      | Usernames | Passwords |
      | admin     | password  |
      | adminUser | Password  |