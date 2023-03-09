@user_profile
Feature: As a user, I should be able to see all the options under the user profile.

  Background: User is already at the home page
    Given the user is on the login page
    When the user logged in as "hr"
    And user clicks the login button
    Then verify the user should be at the home page

  Scenario:  Verify the users view all options under the profile


    When users click the profile name
    Then verify the users see flowing five options:
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |
