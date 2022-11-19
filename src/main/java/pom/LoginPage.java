package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath ="//input[@id='user-name']")private WebElement UserName;
	@FindBy(xpath ="//input[@id='password']")private WebElement Password;
	@FindBy(xpath ="//input[@id='login-button']")private WebElement Login;
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterUserName (String user) {
		UserName.sendKeys(user);
	}
	
	public void enterPassword (String pass) {
		Password.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		Login.click();
	}

}
