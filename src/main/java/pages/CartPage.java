package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
	private WebDriver driver ;
	
	public CartPage (WebDriver driver)
	
	{
		this.driver = driver ;
	}

	
	private final By placeOrderBtn = By.cssSelector("button.btn.btn-success") ;
	
	
	public void placeOrder ()
	
	{
		driver.findElement(placeOrderBtn).click();
	}
	
	
	
}
