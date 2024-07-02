package StepDefination;
/*Parent class*/

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObject.AddNewCustomerPage;
import pageObject.LoginPage;
import pageObject.SearchCustomerPage;

public class BaseClass 
{
	public static WebDriver Driver;
	public LoginPage loginpg;
	public SearchCustomerPage SearchCustPg;
	public AddNewCustomerPage addNewCustPg;
	

	//generate unique email id
public String generateEmailId()
{
	return (RandomStringUtils.randomAlphabetic(5));	
}
	
}
//dfnvknfdnvokfdajokvjoakjcvokjdfc