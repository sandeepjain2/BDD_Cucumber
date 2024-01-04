Feature: MyAccountLoginMultiUser

#sample login with parameter for multi user
Scenario Outline: Login with Valid username and password
Given Open the browser
When Enter the URL "http://practice.automationtesting.in/"
And Click on My Account Menu
And Enter registered username "<username>" and password "<password>"
And Click on login button
Then Verify Login
  Examples:
  | username        | password         |
  | username1       | password1        |
  | username2       | password2        |
  | pavanoltraining | Test@selenium123 |