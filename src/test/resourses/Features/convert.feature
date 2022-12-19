# Simple web app is to receive any number and show a petrified version of it.
# Date of Test : DD-MM-YYYY

@SmokeScenario
Feature: feature to test prettify number functionality

  Scenario: Check prettify number functionality of Web Application
    Given open browser
    And navigate to prettify number function page
    When user enters any number input
    And clicks on prettify button
    Then show entered number prettified version


