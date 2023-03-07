@login

 # Background: For all scenarios user can login with valid credentials
   # Given the user logged in as

Feature: As a user, I should be able to log in to the with valid credentials.

  Scenario: Verify login with valid credentials

    Given the user is on the login page
    #can use hr, help desk, or marketing
    When the user logged in as "hr"

    And user clicks the login button

    Then verify the user should be at the home page

    #Examples: (but using configuration file for inputs)

      #| username                | password      |

      #| hr45@cydeo.com          | UserUser      |

      #| helpdesk52@cydeo.com    | UserUser      |

      #| marketing13@cydeo.com   | UserUser      |




