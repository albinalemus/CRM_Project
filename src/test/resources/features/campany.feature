@company
Feature:  As a user, I should be able to access to the Company page .


  Background: User is already at the home page
    Given the user is on the login page
    When the user logged in as "hr"
    And user clicks the login button

  Scenario:  Verify users see the seven modules in the Company page shown as design

    Given users are on the homepage
    When users click the Company module
    Then verify the users see flowing seven options:

      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News (RSS)  |


