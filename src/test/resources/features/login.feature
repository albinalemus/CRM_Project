

 # Background: For all scenarios user can login with valid credentials
   # Given the user logged in as

Feature: As a user, I should be able to log in to the with valid credentials.
      Agile Story: I should be able to login with valid credentials and get error message for invalid
  @login
  Scenario: Verify login with valid credentials
    Given the user is on the login page
    #can use hr, help desk, or marketing
    When the user logged in as "hr"
    And user clicks the login button
    Then verify the user should be at the home page

    @loginWithInvalid
    Scenario: Verify error message when provided invalid credentials
      Given the user is already on the login page
      When the user types in invalid credentials
      And user then clicks the login button
      Then user should see error message




