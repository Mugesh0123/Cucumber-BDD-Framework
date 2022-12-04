@timesheets
Feature: This feature is to get pending timesheet

  Scenario Outline: this test is to verify the pending timesheet
    Given The user is on the home page
    And The user click on the time option from the menu
    And The user enters the name as"John Smith"
    And Click on the view button
    Then The user should see the message as "<message>"

    Examples: 
      | message             |
      | No Timesheets Found |
