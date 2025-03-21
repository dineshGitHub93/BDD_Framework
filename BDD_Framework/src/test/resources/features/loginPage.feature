Feature: User login functionality validation
@login
Scenario Outline: user login with multiple crendentials
Given user is login on page
When user enters valid username as "<username>" and password as "<password>"
Then user should be redirected to the homepage

Examples:
		|username |password |
		|username2 |password2 |
		|username3 |password3 |
		|username4 |password4 |