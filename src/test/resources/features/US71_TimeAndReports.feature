@qamar
Feature:
  User Story: As a user, I want to access the Time and Reports page.

  Background: User is already at the home page
    Given the user is on the login page
    When the user logged in as "hr"
    And user clicks the login button

  Scenario: Verify the users view all modules in the Time and Reports page.
    When users click the Time and Reports module
    Then verify the users see flowing 5 options:
      | Absence Chart          |
      | Worktime               |
      | Bitrix24.Time          |
      | Work Reports           |
      | Meetings and Briefings |



