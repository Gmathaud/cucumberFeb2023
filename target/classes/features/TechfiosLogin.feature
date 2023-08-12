@DatabaseLoginFeature @Regression
Feature: Techfios billing login page functionality validation

   
  @DbLoginScenario1
  Scenario: User should be able to login with valid credentials
   Given User is on the techfios login page
    When User enters username from mysql database
    When User enters password from mysql database
    When User clicks on sign in button
    Then User should land on dashboard page

  