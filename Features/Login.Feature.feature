Feature:Login

@Sanity @regression
Scenario: Successful login with valid credentials
		Given user launch chrome browser
		When user open url "http://admin-demo.nopcommerce.com/login"
		And user enter Email as "admin@yourstore.com" and Password as "admin"
		And click on login
		Then page title should be "Dashboard/nopCommerce administration"
		When user click on logout link
		Then page title should be "your store.login"
		And close browser
@regression
Scenario Outline:Successful login with valid credentials
			Given user launch chrome browser
			When user open url "http://admin-demo.nopcommerce.com/login"
			And user enter Email as "<Email>" and Password as "<Password>"
			And click on login
			Then page title should be "Dashboard/nopCommerce administration"
			When user click on logout link
			Then page title should be "your store.login"
			And close browser

Examples:
|Email|Password	|
|admin@yourstore.com|admin|
#|test@yourstore.com|admin|





