Feature: login functionality

Scenario: entering invalid username and pswd

Given I load the "https://opensource-demo.orangehrmlive.com/" sample
Then I enter username and password into the respective field
|username|password|
|admin|admin123|
|admin1|admin456|
|admin3|admin789|
Then I click login button
