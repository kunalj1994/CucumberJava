Feature: login feature

Scenario: Validate first name user field 

Given User is at facebook login page
When User enters user first name
Then User checks user first name is present 

Scenario: Validate create user multiple fields
Given User is at facebook login page
When User enters user first name
And User enters user last name
Then User checks user first name is present
But Mobile field should be blank


