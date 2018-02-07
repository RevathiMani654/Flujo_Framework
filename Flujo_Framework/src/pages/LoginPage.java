package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.BaseTest;
import generic.IAutoConstant;

public class LoginPage implements IAutoConstant
{
	@FindBy(id="username")
	private WebElement unTB;
	@FindBy(name="password")
	private WebElement pwTB;
	@FindBy(className="submit_btn")
	private WebElement subBTN;
	@FindBy(id="error-message")
	private WebElement errMsg;
	@FindBy(xpath="//a[@title='Forgot Password']")
	private WebElement forgotPWD;
	@FindBy(xpath="//a[@title='Change Password']")
	private WebElement chgPWD;
	@FindBy(xpath="//title[.='Flujo']")
	private WebElement getTitle;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userName(String un)
	{
		unTB.sendKeys(un);
	}
	public void password(String pwd)
	{
		pwTB.sendKeys(pwd);
	}
	
	public void submitButton()
	{
		subBTN.click();
	}
	
	public void forgetPassword()
	{
		forgotPWD.click();	
	}

	public void changePassword()
	{
		chgPWD.click();
	}
	public void ErrorMsg()
	{
		Reporter.log(errMsg.getText(),true);
	}
	
//	public void getTitleMsg()
//	{
//		Reporter.log(getTitle.getText(),true);
//	}
}
