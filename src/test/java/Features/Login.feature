Feature: Orange HRM
#Scenario: Login Functionality
#
#Given : User is on login page
#When : User enters username 
#And : User enters "admin123" 
#And : clicks on Login button
#Then : User should be able to login successfuly
 
Scenario Outline: Login Functionality with scenatio outline

Given : User is on login page
When : User enters <username> and <password>
And : clicks on Login button
Then : User should be able to login successfuly
Examples: 
	|username|password|
	|Admin	|admin123|
	|test	|test1|
 



