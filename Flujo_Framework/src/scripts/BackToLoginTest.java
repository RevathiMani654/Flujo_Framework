package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.ForgotPage;
import pages.HomePage;
import pages.LoginPage;

public class BackToLoginTest extends BaseTest 
{
	@Test(priority=4,groups={"smoke","login"})
	public void BackToLogin() throws InterruptedException
	{
	 	
		HomePage h=new HomePage(driver);
		h.LoginButton();
		Thread.sleep(3000);
		
		
		
		LoginPage l=new LoginPage(driver);
		l.forgetPassword();
		Thread.sleep(4000);
		
		ForgotPage f=new ForgotPage(driver);
		f.BackLoginPage();
		Thread.sleep(3000);
		
		
		
	}

}
