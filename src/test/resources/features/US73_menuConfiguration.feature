@amal
Feature:
  User Story : As a user, I should be able to configure the menu.

  Background: User is already at the home page
    Given the user is on the login page
    When the user logged in as "hr"
    And user clicks the login button
    Then verify the user should be at the home page

  Scenario: Verify users can access to 6 options under the CONFIGURE MENU
    When users click the CONFIGURE MENU option
    Then verify the users see flowing 6 options:
      | Configure menu items               |
      | Collapse menu                      |
      | Remove current page from left menu |
      | Add custom menu item               |
      | Change primary tool                |
      | Reset menu                         |




