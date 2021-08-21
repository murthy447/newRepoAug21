Feature: Customer Registration


Scenario Outline: Registering with multiple users

Given I load the Url "https://webapps.tekstac.com/CustomerRegistration/"
Then I enter name <username>
And I enter age <age>
And I enter address <address>
And I enter number <number>
And I enter email <email>
Then I click submit button

Examples:
|username|age|address|number|email|
|vcentry|4|Guindy|123456|vcentry@gmail.com|
|vcentry12|5|Adyar|456789|vcentry@gmail.com|