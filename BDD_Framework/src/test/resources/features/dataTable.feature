Feature: Data table
	Verify that the new registration is successfull with valid data
@dataTable
Scenario: 
	Given I am on the new registration page
	When I enter invalid valid data page
			|Fields |Values |
			|First Name |Cucumber |
			|Last Name |BDD |
			|Email Address |cucumberbdd@gmail.com |
			|Mobile Number |1236598741 |
	Then  the user registration should be successful
			