@Addresslist
Feature: Address Module Api Automation

  Scenario Outline: Verify add user address to the application through api
    Given User add header and bearer authorization for accessing address endpoint
    When User add request body for add new address "<first_name>","<last_name>","<mobile>","<apartment>","<state>","<city>","<country>","<zipcode>","<address>","<address_type>"
    And User send "POST" request for addUserAddress endpont
    Then User verify the status code is 200
    Then User verify the addUserAddress response message matches "Address added successfully"

    Examples: 
      | first_name | last_name | mobile     | apartment | state | city | country | zipcode | address | address_type |
      | Mani       | N         | 9952260926 | ANS       |   123 |   11 |     101 |  600097 | Chennai | Home         |

  Scenario Outline: Verify update user address to the application through api
    Given User add header and bearer authorization for accessing address endpoint
    When User add request body for add new address "<first_name>","<last_name>","<mobile>","<apartment>","<state>","<city>","<country>","<zipcode>","<address>","<address_type>"
    And User send "PUT" request for updateUserAddress endpont
    Then User verify the status code is 200
    Then User verify the updateUserAddress response message matches "Address added successfully"

    Examples: 
      | first_name | last_name | mobile     | apartment | state | city | country | zipcode | address | address_type |
      | Mani       | N         | 9952260926 | ANS       |   123 |   11 |     101 |  600097 | Chennai | Home         |

  Scenario Outline: Verify get user address to the application through api
    Given User add header and bearer authorization for accessing address endpoint
    When User send "GET" request for getUserAddress endpoint
    And User verify the status code is 200
    Then User verify getUserAddress response message matches "OK"

  Scenario Outline: Verify delete address to the application through api
    Given User add header and bearer authorization for accessing address endpoint
    When User and request body for add delete address "<address_id>"
    And User send "DELETE" request for deleteAddress endpoint
    Then User verify the status code is 200
    Then User verify the deleteAddress response message matches "Address deleted successfully"
