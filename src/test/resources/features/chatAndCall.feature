@chatAndCall

Feature: Chat and Call modules
  User Story: As a user, I should be able to access the Chat and Calls module

  Background: User is already at the home page
    Given the user is on the login page
    When the user logged in as "hr"
    And user clicks the login button

  Scenario: Verify user has access to Chat and Calls
    When user clicks on Chat and Calls
    Then verify user see the following modules
      | Messages(s)     |
      | Notifications   |
      | Settings        |
      | Activity Stream |


