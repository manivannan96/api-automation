@Searchproduct
Feature: Search Product Module API Automation

  Scenario Outline: Verify user Search Product to the application through api
    Given User add header for search product
    When User add request body for search product "<text>"
    And User send "POST" request for search product endpoint
    Then User verify the status code is 200
    Then User verify the search product response message matches "Verify OK in get product list"

    Examples: 
      | text |
      | nuts |
