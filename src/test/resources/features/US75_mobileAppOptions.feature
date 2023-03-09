@adi
Feature:
  User Story : As a user, I want to see mobile app options to download.

  Background: User is already at the home page
    Given the user is on the login page
    When the user logged in as "hr"
    And user clicks the login button
    Then verify the user should be at the home page

  Scenario: Verify users can see mobile app options
    Given users on the main page
    Then verify the users can see folowing two options:
      | APP STORE   |
      | GOOGLE PLAY |
