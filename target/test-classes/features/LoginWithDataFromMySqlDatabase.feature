@LoginFeature
Feature: Techfios billing login page functionality validation

  Background: 
    Given User is on the techfios login page
    When User enters username as "demo@techfios.com"

  @LoginScenario1
  Scenario: User should be able to login with valid credentials
    When User enters password as "abc123"
    When User clicks on sign in button
    Then User should land on dashboard page

  @LoginScenario2
  Scenario: User should  not be able to login with valid credentials
    When User enters password as "abc1234"
    When User clicks on sign in button
    Then User should land on dashboard page
