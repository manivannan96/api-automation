@Getcitylist
Feature: CityList Module API Automation

  Scenario Outline: Verify user Get CityId endpoint
    Given User and header for citylist page
    When User add request body to get cityId "<state_id>"
    And User send "POST" request for citylist endpoint
    Then User verify the status code is 200
    Then User verify the citylist response body "Yercaud" is present and get the cityId

    Examples: 
      | state_id |
      |       35 |
