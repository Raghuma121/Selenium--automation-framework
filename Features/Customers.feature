Feature: Customer

Background: Steps common for all Scenarios
		Given user launch chrome browser
		When user open url "http://admin-demo.nopcommerce.com/login"
		And user enter Email as "admin@yourstore.com" and Password as "admin"
		And click on login
		Then user can view dashboard 

Scenario: Add new customer

		When user Click on customers menu 
		And click on customers menu Item
		And click on Add new button
		Then user can view add new customer page
		When user enter customer info
		And click on Save button
		Then user can view confirmation page "The new customer has been added successfully"
		Then close browser

@regression
Scenario: search Customer by Email

		When user Click on customers menu 
		And click on customers menu Item
		And enter customer Email
		When click on search button
		Then user should found Email in the search table
		Then close browser
@regression
Scenario: Seacrh Customer by Name


		When user Click on customers menu 
		And click on customers menu Item
		And enter Customer FirstName
		And enter Customer LastName
		When click on search button
		Then user should found Name in the search table
		Then close browser




