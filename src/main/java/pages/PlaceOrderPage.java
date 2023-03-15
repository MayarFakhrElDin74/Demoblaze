package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage {
	
	private WebDriver driver ;
	
	public PlaceOrderPage (WebDriver driver)
	
	{
		this.driver = driver ;
	}
	
	private final By nameTxtBox = By.id("name") ;
	private final By countryTxtBox = By.id("country") ;
	private final By cityTxtBox = By.id("city") ;
	private final By creditCardTxtBox = By.id("card") ;
	private final By monthTxtBox = By.id("month") ;
	private final By yearTxtBox = By.id("year") ;
	private final By purchaseBtn = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]") ;
	
	
	
	public void userEntersDataToPlaceOrder
	(String name, String country , String city , String card , String month , String year)
	
	{
		driver.findElement(nameTxtBox).sendKeys(name);
		driver.findElement(countryTxtBox).sendKeys(country);
		driver.findElement(cityTxtBox).sendKeys(city);
		driver.findElement(creditCardTxtBox).sendKeys(card);
		driver.findElement(monthTxtBox).sendKeys(month);
		driver.findElement(yearTxtBox).sendKeys(year);
		
		driver.findElement(purchaseBtn).click();
		
	}

}
