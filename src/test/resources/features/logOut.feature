@LogOut
Feature: As a user a should be able to logout

  Background: user logs in to account

    Given the user is on the login page
    When the user logged in as "hr"
    And user clicks the login button
    Then verify the user should be at the home page

  Scenario: Verify the Users log out from the app
    Given user is on any page of the app
    When users click the user profile name
    And users select the “Log Out” option
    Then verify the user back to the login page
