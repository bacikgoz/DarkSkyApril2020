@web

Feature: Verify DarkSky

  Background:
    Given I am on DarkSky Home Page


  @temptimeline-1
  Scenario: Verify timeline is displayed in correct format
    Then I verify timeline is displayed with two hours incremented

  @individualtemptimeline
  Scenario: Verify individual day temp timeline
    Then I verify the lowest and the highest temp is displayed correctly

