package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.IAutoConstant;

public class ForgotPage implements IAutoConstant
{
	@FindBy(id="emailId")
	private WebElement emailID;
	
	@FindBy(id="submit_btn")
	private WebElement submitBTN;
	
	@FindBy(xpath="//a[.='Back to Login Page']")
	private WebElement backLoginBTN;
	@FindBy(xpath="//title[.='Forgot Password']")
	private WebElement getTitle;
	
	public ForgotPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void RecoveryEmailID(String RPemailID)
	{
		Reporter.log("RecoveryEmail Page is displayed",true);
		emailID.sendKeys(RPemailID);
		
	}
	
	public void SubmitButton()
	{
		submitBTN.click();
	}
	public void BackLoginPage()
	{
		backLoginBTN.click();
	}
	
//	public void getTitleMsg()
//	{
//		Reporter.log(getTitle.getText(),true);
//	}

}
