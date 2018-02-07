package scripts;

import org.testng.annotations.Test;

import generic.AUL;
import generic.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest
{
    @Test(priority=2,groups={"smoke","login"})
    public void InvalidLogin() throws InterruptedException
    {
    	String un=AUL.getCellValue(XL_PATH, "InvalidLogin", 1, 0);
        String pwd=AUL.getCellValue(XL_PATH, "InvalidLogin", 1, 1);
    			
    	HomePage h=new HomePage(driver);
    	h.LoginButton();
    	Thread.sleep(4000);
    	
    	LoginPage l=new LoginPage(driver);
    	l.userName(un);
    	Thread.sleep(2000);
    	l.password(pwd);
    	Thread.sleep(2000);
    	l.submitButton();
    	Thread.sleep(2000);
    	l.ErrorMsg();
    	Thread.sleep(4000);
    	
    	
    	
    }
			

}
