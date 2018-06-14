Feature: login feature

Background: common login steps 
Given User is at facebook login page

Scenario: Validate first name user field 
When User enters user "Jharna" first name
Then User checks user "Jharna" first name is present 

Scenario: Validate create user multiple fields
When User enters user "Tina" first name
And User enters user "Jain" last name
Then User checks user "Tina" first name is present
But Mobile field should be blank


