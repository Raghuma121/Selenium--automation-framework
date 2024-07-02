package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPage 
{
	WebDriver ldriver;

	public SearchCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(id="SearchEmail")
	WebElement emailAdd;

	@FindBy(xpath="//button[@id='search-customers']")
	WebElement searchBtn;

	@FindBy(xpath="//table[@id='customers-grid']")
	WebElement searchResult;

	@FindBy(xpath="//table[@id='customers-grid']//tbody/tr")
	List<WebElement> tableRows;

	/*@FindBy(xpath="//table[@id='customers-grid']//tbody/tr[1]/td")
	List<WebElement> tableColumns;*/

	@FindBy(xpath="//input[@id='SearchFirstName']")
	WebElement firstName;

	@FindBy(xpath="//input[@id='SearchLastName']")
	WebElement lastName;



	private String i;

	//action method to enter email address
	public void enterEmailAdd(String email)
	{
		emailAdd.sendKeys(email);
	}

	//action method to perform click action
	public void clickOnSearchButton()
	{
		searchBtn.click();
	}
	public boolean searchCustomerByEmail(String email)
	{
		boolean found = false;

		// Total no of rows in a grid
		int ttlRows = tableRows.size();

		for (int i = 1; i <= ttlRows; i++) { // Corrected loop syntax
			WebElement webElementEmail = ldriver.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr[" + i + "]/td[2]")); // Dynamically use the current row index
			String actualEmailAdd = webElementEmail.getText();

			if (actualEmailAdd.equals(email))
			{
				found = true;
				break; // Once email is found, exit the loop
			}
		}

		return found;
	}
	//action method to enter first Name
	public void enterfirstName(String firstNametxt)
	{
		firstName.sendKeys(firstNametxt);
	}
	//action method to enter last Name

	public void enterlastName(String lastNametxt)
	{
		lastName.sendKeys(lastNametxt);
	}

	public boolean searchCustomerByName(String Name)
	{
		boolean found = false;

		// Total no of rows in a grid
		int ttlRows = tableRows.size();

		for (int i = 1; i <= ttlRows; i++) { // Corrected loop syntax
			WebElement webElementName = ldriver.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr[" + i + "]/td[3]")); // Dynamically use the current row index
			String actualName = webElementName.getText();

			if (actualName.equals(Name))
			{
				found = true;
				break; // Once email is found, exit the loop
			}
		}

		return found;
	}	



}
//
