@annotation
Feature: Annotation
#This os how background can be used to eliminate duplicate steps

Background:
	Given i am on facebook login page
	
#Scenarios with AND
Scenario:
	When I enter username as "TOM"
	And I enter password as "JERRY"
	Then login should show an error message

#Scenarios with BUT
Scenario:
	When I enter username as "TOM"
	And I enter password as "JERRY"
	Then login should show an error message
	But Re-login option should be available
