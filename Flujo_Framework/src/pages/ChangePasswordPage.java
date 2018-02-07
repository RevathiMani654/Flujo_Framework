package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.IAutoConstant;

public class ChangePasswordPage implements IAutoConstant
{
	@FindBy(id="emailId")
	private WebElement cemailID;
	@FindBy(id="oldPassword")
	private WebElement oldpwd;
	@FindBy(id="newPassword")
	private WebElement newPwd;
	@FindBy(xpath="//a[.='Update']")
	private WebElement updateBTN;
	@FindBy(xpath="//a[.='Back to Login Page']")
	private WebElement backToLgnBTN;
	@FindBy(xpath="//title[.='Change Password']")
	private WebElement getTitle;
	
	public ChangePasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void EnterEmailID(String CEmailId)
	{
		Reporter.log("ChangePasswordPage is displayed",true);
		cemailID.sendKeys(CEmailId);
	}
	
	public void OldPassword(String oldPass)
	{
		oldpwd.sendKeys(oldPass);
	}

	public void newPaasword(String newPass)
	{
		newPwd.sendKeys(newPass);
	}
	
	public void UpdateEmail()
	{
		updateBTN.click();
	}
	public void BackToLoginPage()
	{
		backToLgnBTN.click();
	}
//	public void getTitleMsg()
//	{
//		Reporter.log(getTitle.getText(),true);
//	}
}
