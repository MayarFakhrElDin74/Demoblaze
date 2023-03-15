package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductDetailsPage;

public class AddToCartTest extends TestBase {
	
	
	HomePage homeObject ;
	ProductDetailsPage productdetailsObject ;
	
	
@Test (priority = 1)

public void UserCanAddProductToCart ()

{
	homeObject = new HomePage(driver) ;
	homeObject.goToProductDetailsPage();
	
	productdetailsObject = new ProductDetailsPage(driver) ;
	productdetailsObject.addProductToCart();
	
}


}
