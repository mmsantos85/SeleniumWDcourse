Feature: login into account
	Existing user should be able to login to account using correct credentials
	
Scenario: Login into account with correct credentials
	Given User navigates to bol.com website   
	And User has to agree with cookies 
	And User clicks on the login button1 
	And User enters a valid username
	And User enters a valid password
	When User clicks on the login button2   
	Then User should be navigated to profile