@Prifilepicture
Feature: Change Profile Picture Module API Automation

  Scenario Outline: 
    Given User add headers,formdata and bearer authorization for accessing change profile picture endpoint
    When User and request multipart for change profile picture
    And User send "POST" request for change profile picture endpoint
    Then User verify the status code is 200
    Then User verify the change profile picture response message matches "Profile updated Successfully"
