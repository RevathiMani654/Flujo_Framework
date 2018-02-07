package scripts;

import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.AUL;
import generic.BaseTest;
import generic.IAutoConstant;
import pages.ForgotPage;
import pages.HomePage;
import pages.LoginPage;

public class ForgotPasswordRecoveryTest extends BaseTest
{
  @Test(priority=3,groups={"smoke","login"})
  
  public void RecoveryPassword() throws InterruptedException
  {
	  String RPemailID=AUL.getCellValue(XL_PATH, "RecoveryPassword", 1, 0);
	 
	   HomePage h=new HomePage(driver);
  	   h.LoginButton();
  	   Thread.sleep(4000);
  	   
  	   LoginPage l=new LoginPage(driver);
  	   l.forgetPassword();
  	   Thread.sleep(4000);
  	   
  	   ForgotPage f=new ForgotPage(driver);
  	   f.RecoveryEmailID(RPemailID);
  	   Thread.sleep(2000);
  	   f.SubmitButton();
  	   Thread.sleep(2000);
  	   Alert alert = driver.switchTo().alert();
  	   Reporter.log(alert.getText(),true);
  	   Thread.sleep(2000);
  	   alert.accept();
  	   Thread.sleep(4000);
  	   
  	   
  	 
  }
}
