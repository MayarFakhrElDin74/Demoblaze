package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {

	
	private final WebDriver driver ;
	

	public SignUpPage (WebDriver driver)
	
	{	
     this.driver = driver ;
	}
	
	
	private final By userNameTxtBox = By.xpath("//*[@id=\"sign-username\"]") ;
	private final By passwordTxtBox = By.xpath("//*[@id=\"sign-password\"]") ;
	private final By signUpBtn = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]") ;
	
	
	
	public void UserCanSignUp (String username , String password)
	
	{
		
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000)) ;

	wait.until(ExpectedConditions.elementToBeClickable(userNameTxtBox)) ;
	
	driver.findElement(userNameTxtBox).click();
	driver.findElement(userNameTxtBox).sendKeys(username);
	
	driver.findElement(passwordTxtBox).click();
	driver.findElement(passwordTxtBox).sendKeys(password);
	
	driver.findElement(signUpBtn).click();
	
	wait.until(ExpectedConditions.alertIsPresent()) ;
	
	Alert alert =  driver.switchTo().alert() ;

	alert.getText() ;
	alert.accept();
	
	}
	
	
	

}
