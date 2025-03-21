#scenarioOutline
Feature: Login functionality
	
	User verify that end to end login with multiple credentils functionality is working fine for website
@multiCred
Scenario Outline: login with multiple functionality
	Given user is on login page
	When user enter is username as "<username>" and password as "<password>"
	Then user should show an error message
	
Examples:
	|username  |password |
	|standard_user|secret_sauce|
	|problem_user|secret_sauce|
	|visual_user|secret_sauce|
	