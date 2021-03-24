Feature: filling in registration form
	A new user should be able to fill in the registration form to create a new account
	
Scenario: new user registration path
Given that the user is at the registration form page 
Then user clicks on agree cookies  
Then user ticks Ms
Then the user should type her first name
Then the user should type her insertion  
Then the user should type her last name 
Then the user thicks Nederlands
Then user should type a valid zipcode
Then user should type a valid house number
Then the user should type a valid phone number
Then email should be already inserted 
Then the user should type a valid password
And the user should decide if she wants newsletters   
Then the user clicks on the send button  
