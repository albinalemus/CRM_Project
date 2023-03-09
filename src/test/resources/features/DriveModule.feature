@wip
Feature: As a user, I want to access the Drive page.

  Background: user logs in to account

    Given the user is on the login page
    When the user logged in as "hr"
    And user clicks the login button
    Then verify the user should be at the home page

  Scenario: Verify the users view all modules in the Drive page.
    Given users are on the homepage
    When users click the Drive module
    Then verify the users see flowing six options
      |My Drive                   |
      |All Documents              |
      |Company Drive              |
      |Sales and Marketing        |
      |Top Management's documents |
      |Drive Cleanup              |

