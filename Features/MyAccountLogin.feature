Feature: MyAccountLogin
  Description: This feature will test a login feature

#sample login without parameter
  #Scenario: Login with Valid username and password
    #Given Open the browser
    #When Enter the URL "http://practice.automtiontesting.in/"
    #And Click on My Account Menu
    #And Enter registered username and password
    #And Click on login button
    #Then User must successfully login to the web page

  #sample login with parameter
  Scenario: Login with Valid username and password
    Given Open the browser
    When Enter the URL "http://practice.automationtesting.in/"
    And Click on My Account Menu
    And Enter registered username "pavanoltraining" and password "Test@selenium123"
    And Click on login button
    Then User must successfully login to the web page