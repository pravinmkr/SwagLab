package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	
	@FindBy(xpath="//button[text()='Checkout']")private WebElement Checkout;
	

}
