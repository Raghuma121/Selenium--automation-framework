package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.org.jline.utils.Log;
import pageObject.AddNewCustomerPage;
import pageObject.LoginPage;
import pageObject.SearchCustomerPage;
/*Child class of BaseClass*/
public class stepDef extends BaseClass {

	public WebDriver driver;
	public LoginPage loginPg;
	
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser()
	{
		 WebDriverManager.chromedriver().setup();
		   Driver=new ChromeDriver();
		   loginPg=new LoginPage(Driver);
		  addNewCustPg=new AddNewCustomerPage(Driver);
		  SearchCustPg=new SearchCustomerPage(Driver);
	}

	@When("user open url {string}")
	public void user_open_url(String url)
	{
	   Driver.get(url);
	}

	@When("user enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String Email, String Password)
	
	{ 	
			addNewCustPg.Enteremail(Email);
		   addNewCustPg.EnterPassword1(Password);
		}

	@When("click on login")
	public void click_on_login()
	{
		addNewCustPg.clickOnLogin();
	}

	@Then("page title should be {string}")
	public static void validateTitle(String Expected_Title)
	{
		String Actual_title = Driver.getTitle();
		try {
			Assert.assertEquals(Actual_title, Expected_Title, "Title is Not Matching");
		}catch(AssertionError a)
		{
			System.out.println(a.getMessage());
		}
	}

	@Then("user can view dashboard")
	public void user_can_view_dashboard() 
		{
		   String actualTitle= addNewCustPg.getPageTitle();
		   String expectedTitle= "Dashboard / nopCommerce administration";
		
		   if(actualTitle.equals(expectedTitle))
			{
			
			Assert.assertTrue(true);
			}else
			{
			
			Assert.assertTrue(false);
			}
		}

	@When("user Click on customers menu")
	public void user_click_on_customers_menu() throws InterruptedException
	{
	   addNewCustPg.clickOnCustomersMenu();
	   Thread.sleep(3000);
	}

	@When("click on customers menu Item")
	public void click_on_customers_menu_item() throws Throwable
	{
	   addNewCustPg.clickOnCustomersMenuItem();
	   Thread.sleep(3000);
	}

	@When("click on Add new button")
	public void click_on_add_new_button()
	{
	   addNewCustPg.clickonAddnew();
	}


@Then("user can view add new customer page")
public void user_can_view_add_new_customer_page()
	{
	   String actualTitle=addNewCustPg.getPageTitle();
	   String expectedTitle="Add a new customer / nopCommerce administration";
	   if(actualTitle.equals(expectedTitle))
	   {

		   Assert.assertTrue(true);
	   }else
	   {
		  
		   Assert.assertTrue(false);
	   }
	}

@When("user enter customer info")
public void user_enter_customer_info()
	{
	   // addNewCustPg.enterEmail("raghuma05@gmail.com");
		addNewCustPg.enterEmail(generateEmailId() +"@gmail.com");
	    addNewCustPg.enterPassword("test1");
	    addNewCustPg.enterFirstName("Raghu");
	    addNewCustPg.enterLastName("reddy");
	    addNewCustPg.enterGender("Male");
	    addNewCustPg.enterDob("10/12/1010");
	    addNewCustPg.enterCompanyName("JIO");
	   // addNewCustPg.EnterNewsletter("Test store 2");
	    addNewCustPg.enterAdminContent("Admin content");
	    addNewCustPg.enterManagerOfVendor("Vendor 1");
	    
	   
	}

@When("click on Save button")
public void click_on_save_button() 
	{
	   addNewCustPg.clickOnSave();
	}


@Then("user can view confirmation page {string}")
public void user_can_view_confirmation_page(String ExpectedconfirmationMsg)
	{
	   String bodyTagText=Driver.findElement(By.tagName("Body")).getText();
	   if(bodyTagText.contains(ExpectedconfirmationMsg))
	   {
		   Assert.assertTrue(true);
	   }else
	   {
		   Assert.assertTrue(false);
	   }
	}

	@When("user click on logout link")
	public void user_click_on_logout_link() throws InterruptedException 
	{
	   
		Thread.sleep(3000);
		addNewCustPg.clickOnLogoutBtn();
		
	}



@Then("close browser")
public void close_browser()
{
Driver.close();
Driver.quit();

}
	

@When("enter customer Email")
public void enter_customer_email()
	{
	   SearchCustPg.enterEmailAdd("raghuma05@gmail.com");
	}

@When("click on search button")
public void click_on_search_button()
	{
	  SearchCustPg.clickOnSearchButton();
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
	  	{
			
			e.printStackTrace();
		}
	}
	
@Then("user should found Email in the search table")
public void used_should_found_email_in_the_search_table()
	{
		 String expectedEmail = "raghuma05@gmail.com";
		    // Assuming SearchCustPg.searchCustomerByEmail(expectedEmail) returns true if the email is found
		   
		 boolean isEmailFound = SearchCustPg.searchCustomerByEmail(expectedEmail);
		    
		    // Assert if the email is found in the search table
		   
		 Assert.assertTrue(isEmailFound);
		
	} 
@When("enter Customer FirstName")
public void enter_customer_first_name() 
	{
	    SearchCustPg.enterfirstName("Raghu");
	}

@When("enter Customer LastName")
public void enter_customer_last_name()
	{
	   SearchCustPg.enterlastName("reddy");
	}

@Then("user should found Name in the search table")
public void user_should_found_name_in_the_search_table() 
	{
		 String expectedName = "Raghu reddy";
		    // Assuming SearchCustPg.searchCustomerByEmail(expectedEmail) returns true if the email is found
		   
		 boolean isNameFound = SearchCustPg.searchCustomerByName(expectedName);
		    
		    // Assert if the email is found in the search table
		   
		 Assert.assertTrue(isNameFound);
	}

	
	
}
	
	
	//"Email " + expectedEmail + " not found in the search table


	













	
	