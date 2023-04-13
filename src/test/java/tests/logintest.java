package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.loginpage;


public class logintest extends BaseTest{

	@Test(description = "verify login test")
	  public void loginTest() throws InterruptedException {
		// page initilization
		loginpage loginpage = PageFactory.initElements(getDriver(), loginpage.class);

		
		// navigate to login page
		navigateTo(config.getLoginUrl());
		loginpage.enterEmail("piyush@abc.com");
		loginpage.enterPassword("12344");
		loginpage.onClickLogin();
		
		// Assert login is successful
		//Assert.assertTrue(homepage.isAvatarVisible());
	  }
	
	@Test(description = "verify mandatory login with empty login email")
	public void invalidlogintest() {
		// page initilization
		loginpage loginpage = PageFactory.initElements(getDriver(), loginpage.class);
		
		// navigate to login page
		navigateTo(config.getLoginUrl());
		loginpage.enterEmail("");
		loginpage.enterPassword("12344");
		loginpage.onClickLogin();
		Assert.assertTrue(loginpage.isrequireField());
		
				
				
	}
	
}
