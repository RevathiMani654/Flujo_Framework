package scripts;

import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.AUL;
import generic.BaseTest;
import pages.ChangePasswordPage;
import pages.HomePage;
import pages.LoginPage;

public class ChangePasswordTest extends BaseTest
{
    	@Test(priority=5,groups={"smoke","login"})
    	
    	public void ChangePassword() throws InterruptedException
    	{ 
    		String CEmailId=AUL.getCellValue(XL_PATH, "ChangePassword", 1, 0);
    		String oldPass=AUL.getCellValue(XL_PATH, "ChangePassword", 1, 1);
    		String newPass=AUL.getCellValue(XL_PATH, "ChangePassword", 1, 2);
    		
    		HomePage h=new HomePage(driver);
    		h.LoginButton();
    		Thread.sleep(4000);
    		
    		LoginPage l=new LoginPage(driver);
    		l.changePassword();
    		Thread.sleep(4000);
    		
    		ChangePasswordPage cp=new ChangePasswordPage(driver);
    		cp.EnterEmailID(CEmailId);
    		Thread.sleep(2000);
    		cp.OldPassword(oldPass);
    		Thread.sleep(2000);
    		cp.newPaasword(newPass);
    		Thread.sleep(2000);
    		cp.UpdateEmail();
    		Thread.sleep(4000);
    		
    		Alert alert = driver.switchTo().alert();
    		Reporter.log(alert.getText(),true);
    		Thread.sleep(2000);
    		alert.accept();
    		Thread.sleep(3000);
    		
    	}
}
