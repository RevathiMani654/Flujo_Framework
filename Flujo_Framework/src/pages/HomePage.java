package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.IAutoConstant;

public class HomePage implements IAutoConstant
{
	@FindBy(xpath="//div[.='Login']")
	private WebElement lgnBTN;
	@FindBy(xpath="//title[.='Login Page']")
	private WebElement getTitle;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void LoginButton()
	{
		
		lgnBTN.click();
		Reporter.log("LoginPage is displayed",true);
		
	}
//	public void getTitleMsg()
//	{
//	
//		Reporter.log(getTitle.getText(),true);
//	}
	

}
