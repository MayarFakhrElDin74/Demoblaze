package tests;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JsonDataReader;
import pages.CartPage;
import pages.HomePage;
import pages.PlaceOrderPage;
import pages.PostOrderPage;
import pages.ProductDetailsPage;

public class PlaceOrderTest extends TestBase {
	
	HomePage homeObject ;
	ProductDetailsPage productdetailsObject ;
CartPage cartObject ;
PlaceOrderPage placeorderObject ;
PostOrderPage postorderObject ;
	
	
	@Test (priority = 1)
	
	public void UserCanAddProductToCart ()

	{
		homeObject = new HomePage(driver) ;
		homeObject.goToProductDetailsPage();
		
		productdetailsObject = new ProductDetailsPage(driver) ;
		productdetailsObject.addProductToCart();
		
	}
	
	
	
	@Test (priority = 2)
	
	public void userCanPlaceOrder () throws FileNotFoundException, IOException, ParseException
	
	{
		homeObject = new HomePage(driver) ;
		homeObject.goToCartPage();
		
		cartObject = new CartPage(driver) ;
		cartObject.placeOrder();
		
		
		JsonDataReader jsonDataReader = new JsonDataReader() ;
		jsonDataReader.jsonReader();
		
		placeorderObject = new PlaceOrderPage(driver) ;
			
		placeorderObject.userEntersDataToPlaceOrder
		(jsonDataReader.name , jsonDataReader.country , jsonDataReader.city ,
		jsonDataReader.card , jsonDataReader.month , jsonDataReader.year);
		
		
		postorderObject = new PostOrderPage(driver) ;
		postorderObject.confirmSuccessfulPurchase();
		
		assertTrue(postorderObject.purchaseOrderMsgTxt().equals("Thank you for your purchase!"));
		
	}

}
