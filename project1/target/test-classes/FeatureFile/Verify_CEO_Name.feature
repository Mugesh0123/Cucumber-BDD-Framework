@smokeTest
Feature: This feature is to get the CEO name from the orangeHRM
  Scenario : This test is to verify the CEO name
  Given The user is logged in successfully and is on home Page 
  When The User click on the directory Option from the menu bar
  And The user select teh job title as "Chief Executive Officer" from the drop down
  And click the search button 
  Then The user should see the ceo name as "John Smith"
