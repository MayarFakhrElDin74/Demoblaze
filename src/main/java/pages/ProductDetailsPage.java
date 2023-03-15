package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailsPage {
	
	
	private WebDriver driver ;
	
	public ProductDetailsPage (WebDriver driver)
	
	{
		this.driver =  driver ;
	}
	

	 private final By addToCartBtn = By.cssSelector("a.btn.btn-success.btn-lg") ;
	 
	 
	 
	 public void addProductToCart ()
	 
	 {
		 WebDriverWait wait = new WebDriverWait(driver , Duration.ofMillis(3000)) ;
		 wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)) ;
		 
		 driver.findElement(addToCartBtn).click();
		 
		 wait.until(ExpectedConditions.alertIsPresent()) ;
		 
		 Alert alert = driver.switchTo().alert() ;
		 System.out.println(alert.getText()) ;
		 alert.accept();
		 
	 }
	 
	 
			 
}
