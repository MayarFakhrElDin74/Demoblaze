package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private WebDriver driver ;

	public LoginPage (WebDriver driver) 

	{
		this.driver = driver ;
	}
	
	private final By loginUserNameTxtBox = By.id("loginusername") ;
	private final By loginPasswordTxtBox = By.id("loginpassword") ;
	private final By loginBtn = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]") ;

	
	
	public void registeredUserLogin (String username , String password)
	
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000)) ;
		wait.until(ExpectedConditions.elementToBeClickable(loginUserNameTxtBox)) ;
		
		driver.findElement(loginUserNameTxtBox).click();
		driver.findElement(loginUserNameTxtBox).sendKeys(username);
		
		driver.findElement(loginPasswordTxtBox).click();
		driver.findElement(loginPasswordTxtBox).sendKeys(password);
		
		driver.findElement(loginBtn).click();
			
	}
	
	

}
