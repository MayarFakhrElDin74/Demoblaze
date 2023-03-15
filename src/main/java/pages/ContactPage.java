package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
	
	private WebDriver driver ;
	
	public ContactPage (WebDriver driver)
	
	{
	this.driver = driver ;
	}
	
	
	private final By contactEmailTxtBox = By.id("recipient-email") ;
	private final By contactNameTxtBox = By.id("recipient-name") ;
	private final By msgTxtBox = By.id("message-text") ;
	private final By sendMsgBtn = By.cssSelector("button.btn.btn-primary") ;
	
	
	
	public void userCanContactUs (String email , String name , String msgtxt)
	
	{
		driver.findElement(contactEmailTxtBox).sendKeys(email);
		driver.findElement(contactNameTxtBox).sendKeys(name);
		driver.findElement(msgTxtBox).sendKeys(msgtxt);
		driver.findElement(sendMsgBtn).click();
		
		Alert alert = driver.switchTo().alert() ;
		System.out.println(alert.getText());
		alert.accept();
		
	}
	
	

}
