@MoreOptions
Feature: As a user, I should be able to see all the options under the MORE tab on the homepage.

  Background: user logs in to account

    Given the user is on the login page
    When the user logged in as "hr"
    And user clicks the login button
    Then verify the user should be at the home page


  Scenario:  Verify the users view all options under the MORE tab
    Given users are on the homepage
    When users click the MORE tab
    Then verify the users see following four options:
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |

