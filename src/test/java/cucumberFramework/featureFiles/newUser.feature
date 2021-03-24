Feature: creating a new user
    A new user should be able to create a new account
    
Scenario: create a new user
Given User is navigates to bol.com 
And user clicks on agree cookies1 
And user clicks on login button 
And user thicks on own account
And user enters valid email
When user clicks on make an account
Then user should be navigated to registration form