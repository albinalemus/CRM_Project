@Amine
Feature:
  User Story :  As a user, I should be able to see desktop options to download.

  Background: User is already at the home page
    Given the user is on the login page
    When the user logged in as "hr"
    And user clicks the login button
    Then verify the user should be at the home page

  Scenario: Verify users can see desktop app options
    Then verify the users see flowing three desktop options:
      |  MAC OS      |
      | WINDOWS      |
      | LINUX        |