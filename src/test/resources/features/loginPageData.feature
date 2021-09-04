Feature: login functionality

Scenario Outline: entering valid username and pswd

Given I load the "https://opensource-demo.orangehrmlive.com/" sample
Then I enter <username> into the username field
And I enter <password> into the password field
Then I click login button

Examples:
|username|password|
|admin|pswd113|
|admin1|pswd456|
|admin2|pswd789|
