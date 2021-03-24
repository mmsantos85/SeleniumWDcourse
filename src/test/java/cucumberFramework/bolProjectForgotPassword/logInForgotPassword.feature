Feature: request new passsword
	A user should be able to request a new password once the old is forgotten
	
Scenario: login to bol.com with correct e-mail but forgot password
Given user navigates to bol.com 
And user has to accept cookies
And User clicks on the login button
And user enters a valid e-mail adress
Then user clicks on wachtwoord vergeten?
Then user navigates to request new password page 
Then user fills in e-mail adress
Then user clicks on submit
Then user should get a message stating that a e-mail has been send with a personal link to reset password 

