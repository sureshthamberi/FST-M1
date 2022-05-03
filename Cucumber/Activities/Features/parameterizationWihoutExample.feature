@activity4
Feature: Data driven test without Example

  Scenario: Testing with Data from Scenario
    Given SUser is on Login page
    When SUser enters "admin" and "password"
    Then SRead the page title and confirmation message
    And SClose the Browser