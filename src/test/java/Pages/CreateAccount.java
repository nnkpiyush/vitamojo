package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BaseTest;

public class CreateAccount extends BaseTest {
	
	@FindBy(xpath = "//li[contains(text(),'Create Account')]")
	private WebElement createAccount;
	
	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='phoneNumber']")
	private WebElement phonenumber;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[contains(text(),'Create Account')]")
	private WebElement createAccountButton;
	
	
	// enter email
	public CreateAccount enterEmail(String emailId)  {
		writeTextInField(email,emailId);
		return this;
	}
	
	// enter name
	public CreateAccount enterName(String names)  {
		writeTextInField(name,names);
		return this;
	}

	// enter phone number
	public CreateAccount enterPhone(String phone)  {
		writeTextInField(phonenumber,phone);
		return this;
	}
	
	// enter password
	public CreateAccount enterPassword(String Password)  {
		writeTextInField(password,Password);
		return this;
	}
	
	// on click account button
	public CreateAccount onClickAccountButton()  {
		clickonElement(createAccountButton);
		return this;
	}
	
	
	
	
	

}
