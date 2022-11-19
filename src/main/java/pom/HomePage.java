package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//button[text()='Open Menu']")private WebElement AllItem;
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")private WebElement addtocart1;
	@FindBy(xpath="(//button[text()='Add to cart'])[2]")private WebElement addtocart2;
	@FindBy(xpath="(//button[text()='Add to cart'])[3]")private WebElement addtocart3;
	@FindBy(xpath="(//button[text()='Add to cart'])[4]")private WebElement addtocart4;
	@FindBy(xpath="(//button[text()='Add to cart'])[5]")private WebElement addtocart5;
	@FindBy(xpath="(//button[text()='Add to cart'])[6]")private WebElement addtocart6;
	@FindBy(xpath="//button[text()='Remove']")private WebElement Remove;
	@FindBy(xpath="//a[text()='Twitter']")private WebElement Twitter;
	@FindBy(xpath="//a[text()='Facebook']")private WebElement Facebook;
	@FindBy(xpath="//a[text()='LinkedIn']")private WebElement Linkedin;
	@FindBy(xpath="//a[@class='shopping_cart_link']")private WebElement Cart;
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickonAllItem() {
		AllItem.click();
	}
	public void clickOncart1() {
		addtocart1.click();
	}
	public void clickOncart2() {
		addtocart2.click();
	}
	public void clickOncart3() {
		addtocart3.click();
	}
	public void clickOncart4() {
		addtocart4.click();
	}
	public void clickOncart5() {
		addtocart5.click();
	}
	public void clickOncart6() {
		addtocart6.click();
	}
	public void clickOnRemove() {
		Remove.click();
	}
	public void clickOnTwitter() {
		Twitter.click();
	}
	public void clickOnFacebook() {
		Facebook.click();
	}
	public void clickOnLinkedin() {
		Linkedin.click();
	}
	public void clickOnCart() {
		Cart.click();
	}
}
