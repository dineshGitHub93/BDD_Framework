Feature: Verify login functionality

@sauce
Scenario: Verify login functionality with valid crendentials
Given user is on login page of sauce website
When I enters usernams as "standard_user" and password as "secret_sauce"
Then user should navigate use to the home page