package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver ldriver;	

public LoginPage(WebDriver rDriver)
{
	ldriver=rDriver;
	PageFactory.initElements(rDriver,this);
}
@FindBy(id="Email")
WebElement email;

@FindBy(name="Password")
WebElement Password;

@FindBy(xpath="//button[normalize-space()='Log in']")
WebElement LoginBtn;

@FindBy(linkText="Logout")
WebElement Logout;

public void enterEmail(String emailAdd)
{
	email.clear();
	email.sendKeys(emailAdd);
}
public void enterPassword(String pwd)
{
	Password.clear();
	Password.sendKeys(pwd);
}

public void clickOnLoginButton()
{
	LoginBtn.click();
}

public void clickOnLogoutButton()
{
	Logout.click();
}
}
//

