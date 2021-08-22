@Homepage
Feature: To validate new homepage of NTL Taxi
Scenario: Validate homepage with positive data
Given Open browser
Then Enter URL
And Enter UserName
And Enter MobNumber
Then Enter PickupAddress
And Enter DropAddress
When Select VehicleType
But Dont Click Book Button