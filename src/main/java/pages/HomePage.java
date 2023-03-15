package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	

	private final WebDriver driver;
	
	
    public HomePage (WebDriver driver)
    {
        this.driver = driver;	
	}

    
	private final By signUpLink = By.id("signin2") ;
	private final By loginLink = By.id("login2") ;
	private final By logoutLink = By.linkText("Log out") ;
	private final By contactUsLink = By.linkText("Contact") ;
	private final By laptopsIcon = By.xpath("/html/body/div[5]/div/div[1]/div/a[3]") ;
	private final By productLink = By.linkText("Sony vaio i7") ;
	private final By cartLink = By.linkText("Cart") ;
			
	

public void goTosignUpPage ()

{
	driver.findElement(signUpLink).click();
}


public void goToLoginPage ()

{
	driver.findElement(loginLink).click() ;
}



public void registeredUserCanLogout ()

{
	driver.findElement(logoutLink).click();
}


public String getLoginLinkTxt ()

{
	return driver.findElement(loginLink).getText() ;
	
}


public String getLogoutLinkTxt ()

{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(9000)) ;
    wait.until(ExpectedConditions.visibilityOfElementLocated(logoutLink)) ;
	
	return driver.findElement(logoutLink).getText() ;
	
}

public void goToContactUsPage ()


{	
	driver.findElement(contactUsLink).click(); 	
}


public void goToProductDetailsPage ()

{
	driver.findElement(laptopsIcon).click();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000)) ;
	wait.until(ExpectedConditions.elementToBeClickable(productLink)) ;
	
	driver.findElement(productLink).click() ;
	
}

public void goToCartPage ()

{
	driver.findElement(cartLink).click();
}


}
