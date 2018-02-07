package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.HomePage;

public class LoginTest extends BaseTest
{
	@Test(priority=1,groups={"smoke","login"})
	public void ClickLogin() throws InterruptedException
	{
		//This is LoginPage TestNG Class script
		HomePage h=new HomePage(driver);
		h.LoginButton();
		Thread.sleep(4000);
		//This 1st Test Script for Flujo Applications
		
	}	
}
