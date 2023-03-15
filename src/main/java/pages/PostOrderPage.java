package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostOrderPage {
	
	private WebDriver driver ;
	
	public PostOrderPage (WebDriver driver) 
	
	{
		this.driver = driver ;
	}
	
	
	private final By purchaseOrderMsg = By.xpath("/html/body/div[10]/h2") ;
	private final By okBtn = By.cssSelector("button.confirm.btn.btn-lg.btn-primary") ;
	
	
	public void confirmSuccessfulPurchase ()
	
	{
		driver.findElement(okBtn).click();
	}
	

	public String purchaseOrderMsgTxt ()
	
	{
		return driver.findElement(purchaseOrderMsg).getText() ;
	}
	
}
