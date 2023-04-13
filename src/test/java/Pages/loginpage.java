package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BaseTest;

public class loginpage extends BaseTest {
	@FindBy(xpath = "//input[@id='email']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	private WebElement login;
	
	@FindBy(xpath = "//span[contains(text(),'Required field.')]")
	private WebElement requireField;
	
	

	
	// enter email
	public loginpage enterEmail(String emailId)  {
		writeTextInField(email,emailId);
		return this;
	}

	// enter password
	public loginpage enterPassword(String Password)  {
		writeTextInField(password,Password);
		return this;
	}
	
	// click login
	public loginpage onClickLogin()  {
		clickonElement(login);
		return this;
	}
	
	public boolean isrequireField() {
		return isVisible(requireField);
	}
	
}
