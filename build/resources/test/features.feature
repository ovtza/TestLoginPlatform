Feature: As a potential customer
  I would like to be able to register or log in to fake netguru app
  So maybe I could get a job or buy something

  Background: Opening browser on example app
    Given open example login page

  Scenario: Create an account properly
    And click the new here sign up button
    And type "Test Test" in fullname input
    And type test in username register input
    And type test@test.eu in email input
    And type test in password register input
    And type test in confirm password input
    And wait 5 seconds for async proccesing
    Then click sign up button
    Then account has been successfully created

  Scenario: Both passwords must be identical
    And click the new here sign up button
    And create example account with username testuser
    And type test123 in password register input
    And type test321 in confirm password input
    And wait 5 seconds for async proccesing
    Then click sign up button
    Then account has not been successfully created due to password does not match

  Scenario: Login to the system properly
    And type test in username input
    And type test in password input
    Then click the login button
    And user has successfully logged in

  Scenario: Login to the system with not correct inputs
    And type unknownUser in username input
    And type unknownUser in password input
    Then click the login button
    And user has not successfully logged in