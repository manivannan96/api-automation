@Login
Feature: Login Module Api Automation

  Scenario: Get User logtoken from login endpoint
    Given User and header for login page
    When User and basic authentication for login
    And User send "POST" request for login endpoint
    Then User verify the status code is 200
    Then User verify the login response body firstName present as "Manivannan" and get the logtoken
