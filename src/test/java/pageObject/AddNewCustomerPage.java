package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewCustomerPage 

{

	public WebDriver ldriver;
	//constructor
	public AddNewCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	// find webElements on this page
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement enterEmail;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement enterPassword;
	
	@FindBy(xpath="(//button[normalize-space()='Log in'])[1]")
	WebElement loginbtn;
	
	@FindBy(xpath="(//p[contains(text(),'Customers')])[1]")
	WebElement lnkCustomers_menu;
	
	@FindBy(xpath="//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	WebElement lnkCustomers_menuitem;
	
	@FindBy(xpath="//a[normalize-space()='Add new']")
	WebElement BtnAddnew;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement txtLastName;
	
	@FindBy(xpath="//label[normalize-space()='Male']")
	WebElement MaleGender;
	
	@FindBy(xpath="//input[@id='Gender_Female']")
	WebElement FemaleGender;
	
	@FindBy(xpath="//input[@id='DateOfBirth']")
	WebElement txtDob;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement txtCompanyName;
	
	@FindBy(xpath="//input[@id='IsTaxExempt']")
	WebElement BtnIsTaxExempt;
	
	@FindBy(xpath="(//div[@role='listbox'])[1]")
	WebElement dropdownNewsletter;
	
	@FindBy(xpath = "//*[@id='VendorId']")
	WebElement dropdownVendorMgr;
	
	@FindBy(xpath = "//textarea[@id='AdminComment']")
	WebElement txtAdminContent;
	
	@FindBy(xpath = "//button[@name='save']")
	WebElement BtnSave;
	
	@FindBy(xpath="(//a[normalize-space()='Logout'])[1]")
	WebElement Logutbtn;

	private WebElement FeMaleGender;
	
	
	
//Auction methods for WebElements
	
	public void Enteremail(String email)
	{
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	public void EnterPassword1(String password)
	{
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	
	public String getPageTitle()
	{
		return ldriver.getTitle();
		
	}
	public void clickOnCustomersMenu()
	{
		lnkCustomers_menu.click();
	}
	public void clickOnCustomersMenuItem()
	{
		lnkCustomers_menuitem.click();
	}
	public void clickonAddnew()
	{
		BtnAddnew.click();
	}
	public void enterEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void enterPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void enterFirstName(String firstName)
	{
		txtFirstName.sendKeys(firstName);
	}

	public void enterLastName(String lastName)
	{
		txtLastName.sendKeys(lastName);
	}

	public void enterDob(String dob)
	{
		txtDob.sendKeys(dob);
	}
	
	public void enterCompanyName(String coName)
	{
		txtCompanyName.sendKeys(coName);
	}
	public void clickIstaxExempt()
	{
		BtnIsTaxExempt.click();
	}
	
	public void EnterNewsletter(String value )
	{
		Select drp=new Select(dropdownNewsletter);
		drp.selectByVisibleText(value);
	}
	public void enterManagerOfVendor(String value)
	{
		Select drp=new Select(dropdownVendorMgr);
		drp.selectByVisibleText(value);
	}
	public void enterAdminContent(String content)
	{
		txtAdminContent.sendKeys(content);
	}
	
	public void enterGender(String gender)
	{
		if(gender.equals("Male"))
		{
			MaleGender.click();
		}
		else if(gender.equals("Female"))
		{
			FeMaleGender.click();
		}
		else//default set Male gender
		{
			MaleGender.click();
		}
		
	}
	public void clickOnSave()
	{
		BtnSave.click();
	}
	public void clickOnLogin() 
	{
		loginbtn.click();
		
		
	}
	public void clickOnLogoutBtn() 
	{
		
		Logutbtn.click();
	}
	
}
/////////////////////
