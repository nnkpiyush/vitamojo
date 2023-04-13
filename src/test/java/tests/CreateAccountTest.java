package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.CreateAccount;
import Pages.loginpage;

public class CreateAccountTest extends BaseTest {

	@Test(description = "create account")
	  public void loginTest() throws InterruptedException {
		// page initilization
		loginpage loginpage = PageFactory.initElements(getDriver(), loginpage.class);
		CreateAccount createaccount  = PageFactory.initElements(getDriver(), CreateAccount.class);
		
		// navigate to login page
		navigateTo(config.getLoginUrl());
		Thread.sleep(5000);
		createaccount.onClickAccount();
		createaccount.enterEmail("abc@xynz.com");
		createaccount.enterName("random");
		createaccount.enterPassword("123abcvvc");	
		createaccount.enterPhone("1234567890");
		createaccount.onClickAccountButton();
	
	  }
	
}
