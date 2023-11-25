@Statelist
Feature: StateList Module API Automation

  Scenario: Verify Get StateId endpoint
    Given User and header for statelist page
    When User send "GET" request for statelist endpoint
    Then User verify the status code is 200
    Then User verify the statelist response body "Tamil Nadu" is present and checkid
