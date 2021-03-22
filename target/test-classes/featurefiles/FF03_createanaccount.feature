Feature: Create an account
 @TestRun02
  Scenario Outline: Creating an account
    Given Navigate to create an account screen
    Then Enter firstnam as "<firstname>" 
    Then Enter Lastname as "<Password>"
    
    Examples:
    |firstname|Password|
    |Test01   |pass01  |
    |Test02   |Pass02  | 
    
    
   
    
    
    
 