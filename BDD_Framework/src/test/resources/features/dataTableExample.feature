Feature: Data table example
@dataTable1
Scenario: user enters multiple itesms
	Given the following items:
		|Apple|
		|Mango|
		|Mango |
		
@dataTablemap
Scenario: user enters multiple itesms
	Given the following field and values items
		|username |password |
		|Mango|password123|
		|Orange | passsword124|

@dataTablemap1		
Scenario: Multiple users enter details
  Given the following users:
    | Username | Password  | Role    |
    | JohnDoe  | 12345     | Admin   |
    | JaneDoe  | 67890     | Manager |