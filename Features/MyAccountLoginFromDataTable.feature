Feature: MyAccountLoginFromDataTable

#sample login with parameter From Data Table
  Scenario: Login with Valid username and password
    Given Open the browser
    When Enter the URL "http://practice.automationtesting.in/"
    And Click on My Account Menu
    And Enter registered username and password
      | pavanoltraining | Test@selenium123 |
    And Click on login button
    Then Verify Login