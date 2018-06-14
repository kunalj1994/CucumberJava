Feature: login feature


Scenario: Validate create user multiple fields
Given User is at facebook login page
When Enter following data
  |username |UserSurname |Mobile|  
  |Jharna   |Jain        |4909|
  |Tina     |Jain        |5412|
  